package com.itheima.service;

import com.itheima.Protocol;
import com.itheima.exception.BusinessException;

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

        //根目录
        // D:\img
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
            System.out.println("接收客户端数据："+protocol);
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
        // root
        String fileName = protocol.getFileName();

        //root是提供给客户端的虚拟路径，转换为服务端的真实路径
        String fileDir = fileName.replace("root", rootDir.toString());
        // D:\\img
        File dir = new File(fileDir );

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
        //将虚拟路径变成服务端的真实路径
        String fileName = protocol.getFileName().replace("root", rootDir.toString());
        //TODO 按照文档提供业务流程完服务端上传文件
        System.out.println("待完成！！");
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
        //解析要下载的文件
        //将虚拟路径变成服务端的真实路径
        String fileName = protocol.getFileName().replace("root", rootDir.toString());
        //TODO 按照文档提供业务流程完成服务端下载文件
        System.out.println("待完成！！");

    }

    /**
     * 发送协议数据
     * @param netOut 网络输出流
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
        // "type="scan" , fileName="root" ,  status = null , message= null, \r\n"
        String protocolContent = br.readLine();

        //解析协议
        Protocol protocol = Protocol.parseProtocol(protocolContent);

        return protocol;
    }

}

