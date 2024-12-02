package com.itheima.service;

import com.itheima.Protocol;
import com.itheima.exception.BusinessException;
import com.itheima.util.IOUtil;

import java.io.*;
import java.net.Socket;
import java.util.ResourceBundle;

/*
协议定义:   协议+数据
第一行是协议，第二行开始就是数据
 */
public class FileUpDownServiceImp implements Runnable, FileUpDownService {

    private final ResourceBundle bundle;
    private final File rootDir;
    private Socket socket;

    public FileUpDownServiceImp(Socket socket) {
        this.socket = socket;
        //1 读取配置文件中的端口，根目录等配置信息
        bundle = ResourceBundle.getBundle("yunpan");

        //根目录  rootDir = D:\\img
        rootDir = new File(bundle.getString("rootDir"));
        if (rootDir.isFile()) {
            throw new BusinessException("根目录路径与已存在文件冲突");
        } else if (!rootDir.exists() && !rootDir.mkdirs()) {
            throw new BusinessException("根目录创建失败，请检查配置路径是否正确");
        }
    }

    @Override
    public void run() {
        try (Socket socket = this.socket;) {
            InputStream netIn = socket.getInputStream();
            OutputStream netOut = socket.getOutputStream();

            //读协议
            final Protocol protocol = parseProtocol(netIn);

            System.out.println("接收客户端数据：" + protocol);
            //识别客户端操作类型
            String type = protocol.getType();
            switch (type) {
                case Protocol.Type.SCAN://客户端要浏览
                    scanDirectory(protocol, netIn, netOut);
                    break;

                case Protocol.Type.DOWNLOAD://客户端要下载
                    downloadFile(protocol, netIn, netOut);
                    break;

                case Protocol.Type.UPLOAD://客户端要上传
                    uploadFile(protocol, netIn, netOut);
                    break;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 浏览目录
     *
     * @param protocol
     * @param netIn
     * @param netOut
     * @throws IOException
     */
    @Override
    public void scanDirectory(Protocol protocol, InputStream netIn, OutputStream netOut) throws IOException {
        Protocol response = new Protocol();
        //响应客户端使用
        //获取客户端想要浏览的目录
        String fileName = protocol.getFileName();// root

        //root是提供给客户端的虚拟路径，转换为服务端的真实路径
        String fileDir = fileName.replace("root", rootDir.toString());
        File dir = new File(fileDir);

        if (!dir.isDirectory()) {
            //目录不存在，构建协议返回
            response.setType(Protocol.Type.SCAN);
            response.setStatus(Protocol.Status.FAILED);//失败
            response.setMessage("目录不存在，只能浏览当前子目录");
            send(netOut, response);//发送协议
        } else {
            //目录存在，构建协议返回
            response.setType(Protocol.Type.SCAN);
            response.setStatus(Protocol.Status.OK);//成功
            response.setFileName(protocol.getFileName());
            send(netOut, response);//发送协议

            //把具体数据随后发送
            //把文件数据按照："文件类型 名称"   发送，每一个子文件一行
            OutputStreamWriter osw = new OutputStreamWriter(netOut);
            File[] children = dir.listFiles();

            for (File child : children) {
                String fileType = child.isFile() ? "文件" : "目录";
                osw.write(fileType + " " + child.getName() + "\r\n");//每个文件一行
            }
            //刷新数据
            osw.flush();
        }
    }

    /**
     * 文件上传功能
     *
     * @param protocol
     * @param netIn
     * @param netOut
     */
    @Override
    public void uploadFile(Protocol protocol, InputStream netIn, OutputStream netOut) throws IOException {
        // 将虚拟路径变成服务端的真实路径
        // 例如客户端传过来的是 D:\Download\liqin2.jpg --> 替换成 D:img\liqin2.jpg
        String fileName = protocol.getFileName().replace("root", rootDir.toString());

        // 查看客户端传过来的协议数据 , 把root替换成真实的路径
        System.out.println(fileName);

        // 把客户端传过来的文件封装成File对象
        File upFile = new File(fileName);

        if (upFile.exists()) {
            // 存在 , 表示客户端上传的文件已经上传过了
            protocol.setStatus(Protocol.Status.FAILED);// 给协议对象设置 状态是失败
            protocol.setMessage("此文件已经存在!");// 给协议对象设置 , 失败的的信息
            send(netOut, protocol);
        } else {
            // 不存在 , 代表的是此文件第一次上传
            protocol.setStatus(Protocol.Status.OK);// 给协议对象设置 状态是OK
            // 给客户端反馈信息 , 告知文件可以上传
            send(netOut, protocol);

            // ===============等待客户端上传数据========================
            try (FileOutputStream fos = new FileOutputStream(upFile)) {
                // 把客户端发送过来的数据 , 通过本地的输出流写到本地文件中
                IOUtil.copy(netIn, fos);
            }

            // 返回上传结果
            protocol.setMessage("文件上传成功!");
            send(netOut, protocol);
        }
    }

    /**
     * 文件下载功能
     *
     * @param protocol
     * @param netIn
     * @param netOut
     * @throws IOException
     */
    @Override
    public void downloadFile(Protocol protocol, InputStream netIn, OutputStream netOut) throws IOException {
        // 解析要下载的文件
        // 将虚拟路径变成服务端的真实路径
        String fileName = protocol.getFileName().replace("root", rootDir.toString());
        // TODO 按照文档提供业务流程完成服务端下载文件
        // System.out.println(fileName);

        // 把客户端要下载的字符串文件名封装成File对象
        File downloadFile = new File(fileName);

        // 判断文件是否存在 , 并且是一个文件
        if (downloadFile.exists() && downloadFile.isFile()) {
            // 可以下载 , 给客户端发可以下载的协议
            protocol.setStatus(Protocol.Status.OK);
            send(netOut, protocol);

            // 读取服务器本地文件的数据 , 并把数据发送给客户端
            try (FileInputStream fis = new FileInputStream(downloadFile)) {
                IOUtil.copy(fis, netOut);
            }
            // 告知客户端 , 数据已经发送完毕
            socket.shutdownOutput();
            System.out.println("下载完毕!");
        } else {
            // 不可以下载 , 要么不存在 , 要么是一个文件夹不可以下载
            protocol.setStatus(Protocol.Status.FAILED);
            send(netOut, protocol);
        }
        // 获取客户端发送过来的下载协议
        Protocol downloadProtocol = Protocol.getDownloadProtocol(fileName);
    }

    /**
     * 发送协议数据
     *
     * @param netOut   网络输出流
     * @param response 协议
     * @throws IOException
     */
    private void send(OutputStream netOut, Protocol response) throws IOException {
        String pro = response.toString();
        System.out.println("服务端响应数据：" + pro);
        netOut.write(pro.getBytes());
    }

    /**
     * 解析协议
     *
     * @param netIn
     * @return
     * @throws IOException
     */
    @Override
    public Protocol parseProtocol(InputStream netIn) throws IOException {
        //读取第一行数据
        InputStreamReader isr = new InputStreamReader(netIn);
        BufferedReader br = new BufferedReader(isr);
        // "type=scan,fileName=root,status=null,message=null,\r\n"
        String protocolContent = br.readLine();

        //解析协议
        Protocol protocol = Protocol.parseProtocol(protocolContent);

        return protocol;
    }

}

