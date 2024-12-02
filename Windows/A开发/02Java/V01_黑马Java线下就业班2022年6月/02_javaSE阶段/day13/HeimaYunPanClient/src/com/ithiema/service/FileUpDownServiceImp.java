package com.ithiema.service;


import com.ithiema.exception.BusinessException;
import com.ithiema.util.IOUtil;
import com.ithiema.Protocol;

import java.io.*;
import java.net.Socket;
import java.util.ResourceBundle;
import java.util.Scanner;

/*
    ctrl + shift + "-" : 收缩所有的方法快捷键
    ctrl + shift + "+" : 展开所有的方法快捷键
    ctrl + alt + 左键 : 回退
    ctrl + alt + 右键 : 前进
 */
public class FileUpDownServiceImp implements FileUpDownService {
    /**
     * 用来保存当前浏览的目录
     * 解释 : 其实就是服务器存储数据的文件夹路径
     * 服务器src根目录下的yunpan.properties中的 rootDir
     */
    public File current = new File("root");
    private ResourceBundle bundle;
    private String downloadPath;// 下载的路径

    @Override
    public void start() {
        try {
            // 初始化下载路径，读取配置文件中的数据
            // ResourceBundle读取的是src下的properties文件
            bundle = ResourceBundle.getBundle("yunpan");

            // 根据文件中的键找到对应的值 , 获取对应的值 ---> 就是下载的路径
            // "D:\\download"
            downloadPath = bundle.getString("DownloadPath");

            // 把下载的路径的字符串 , 封装成一个File对象
            File downloadDir = new File(downloadPath);

            // 判断此路径是否是一个文件夹路径
            // 什么时候会抛出异常 ? 此路径是一个文件 , 文件不存在还创建失败了!
            if (downloadDir.isFile()) {
                throw new BusinessException("文件不能当做下载目录，请更改下载路径配置！");
            } else if (!downloadDir.exists() && !downloadDir.mkdirs()) {
                throw new BusinessException("下载目录初始化失败，请检查下载路径配置是否正确！");
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("*******欢迎进入黑马网盘*******");

            // 先显示根目录文件
            // scanDirection(current);

            while (true) {
                System.out.println("***************************************************************************");
                System.out.println("1)浏览当前目录 \t2)浏览子目录 \t3)返回上一级目录 \t4)下载文件 \t5)上传文件");
                System.out.println("***************************************************************************");
                String choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        scanDirection(current);
                        break;
                    case "2":
                        System.out.println("请输入要浏览的子目录：");
                        String dir = sc.nextLine();
                        try {
                            //扫描
                            scanDirection(new File(current, dir));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case "3":
                        if (current.getName().equals("root")) {
                            System.out.println("没有上一级了");
                        } else {
                            scanDirection(current.getParentFile());
                        }
                        break;
                    case "4":
                        //下载
                        System.out.println("请输入要下载的文件名（含后缀）:");
                        String fileName = sc.nextLine();
                        //current=root
                        downloadFile(new File(current, fileName));
                        break;

                    case "5":
                        while (true) {
                            System.out.println("请输入在计算机中要上传的文件路径");
                            String uploadFilePath = sc.nextLine();
                            File upFile = new File(uploadFilePath);
                            if (!upFile.exists()) {
                                System.out.println("文件不存在，请重新输入！");
                            } else if (upFile.isDirectory()) {
                                System.out.println("抱歉，不支持目录上传！");
                            } else if (upFile.isFile()) {
                                uploadFile(upFile);
                                break;
                            }
                        }
                        break;
                    default:
                        System.out.println("功能尚在开发中....");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 连接服务端
     * 解析 ;
     * 不管查看,上传下载都需要连接socket , 所以封装Socket对象进行复用
     *
     * @return
     * @throws IOException
     */
    @Override
    public Socket connect() throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        return socket;
    }

    /**
     * 文件浏览
     * path : 代表的是服务端文件路径
     *
     * @param path
     * @throws IOException
     */
    @Override
    public void scanDirection(File path) {// path = root
        //连接服务端
        try (Socket socket = connect();
             // 用来客户端读取服务端的数据
             InputStream netIn = socket.getInputStream();
             // 用来客户端给服务端发送数据
             OutputStream netOut = socket.getOutputStream();
        ) {

            /*
                获取了协议
                解析 : 拿到协议对象 , 协议对象中封装的是要做浏览数据 , 操作文件的路径

                scanDirProtocol对象 : scan , root
            */
            Protocol scanDirProtocol = Protocol.getScanDirProtocol(path.getPath());

            // 给服务端发送协议
            // "type=scan , fileName=root , status=null , message=null"
            send(netOut, scanDirProtocol);

            System.out.println("===============等待服务器给回应消息================");

            //接收消息
            InputStreamReader isr = new InputStreamReader(netIn);
            BufferedReader br = new BufferedReader(isr);

            String content;
            //System.out.println("开始接收数据：");
            String firstLine = br.readLine();//协议 , 阻塞

            // 把服务端发送过来的一行协议字符串 , 封装成协议对象
            Protocol protocol = Protocol.parseProtocol(firstLine);

            // 获取协议对象中的状态
            if (protocol.getStatus().equals(Protocol.Status.OK)) {
                // 成功
                // 服务端发过来的真正存储数据的file路径, 覆盖给current变量
                current = new File(protocol.getFileName());
                System.out.println("---------------------------------------------------");
                System.out.println("当前目录：" + current);
                while ((content = br.readLine()) != null) {
                    System.out.println(content);
                }
            } else {
                // 失败
                System.out.println("浏览失败:" + protocol.getMessage());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件下载
     *
     * @param file
     */
    @Override
    public void downloadFile(File file) {
        //TODO 按照文档提供业务流程完成客户端下载文件

        try (Socket socket = connect();
             // 用来客户端读取服务端的数据
             InputStream netIn = socket.getInputStream();
             // 用来客户端给服务端发送数据
             OutputStream netOut = socket.getOutputStream();) {

            // 获取下载协议对象 , 给服务端发送要下载文件的协议
            Protocol downloadProtocol = Protocol.getDownloadProtocol(file.getPath());

            // 发送要下载文件的协议
            send(netOut, downloadProtocol);

            // ======================等待服务器给出反馈============================

            // 获取服务端给反馈的协议
            Protocol protocol = Protocol.parseProtocol(netIn);

            // 判断服务端给反馈的信息, 看是否可以下载
            if (protocol.getStatus().equals(Protocol.Status.OK)) {
                // 可以下载 , 接收服务端发送的数据并保存到本地
                File fileName = new File(downloadPath, file.getName());

                // 把服务器给反馈的数据 , 在通过本地的字节输出流 , 写入本地中
                try (FileOutputStream fos = new FileOutputStream(fileName)) {
                    IOUtil.copy(netIn, fos);
                }
                System.out.println("下载完毕!");
            } else {
                // 不可以下载
                System.out.println("下载失败 , " + protocol.getMessage());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件上传
     *
     * @param upFile
     */
    @Override
    public void uploadFile(File upFile) {
        //TODO 按照文档提供业务流程完客户端上传文件
        try (Socket socket = connect();
             // 用来客户端读取服务端的数据
             InputStream netIn = socket.getInputStream();
             // 用来客户端给服务端发送数据
             OutputStream netOut = socket.getOutputStream();) {

            // 2.发送协议
            // current代表的是当前服务端的存储数据的目录 ,  upFile.getName()代表的是当前要上传的文件名字
            // 也就是说把我现在要上传的文件上传到服务端current目录下
            Protocol uploadProtocol = Protocol.getUploadProtocol(new File(current, upFile.getName()));

            // 这回发送的是上传的协议
            send(netOut, uploadProtocol);

            // ===============等待服务端给出反馈====================

            // 根据服务端给返回的协议 , 来判断当前文件是否上传过
            Protocol protocol = Protocol.parseProtocol(netIn);
            System.out.println("服务端反馈的协议" + protocol);

            // 根据服务器反馈的协议 , 来判断此文件是否可以上传
            if (protocol.getStatus().equals(Protocol.Status.OK)) {
                // 可以上传
                // 读取本地的文件发送给服务器
                try (FileInputStream fis = new FileInputStream(upFile)) {
                    // 使用工具类  , 把当前本地中fis流中的数据 发送给服务端(netOut流)
                    IOUtil.copy(fis, netOut);
                }

                // 告知服务器数据已发送完毕
                socket.shutdownOutput();

                // =====================等待服务器接收到数据,在给出反馈信息================
                protocol = Protocol.parseProtocol(netIn);
                System.out.println("上传结束:" + protocol.getMessage());

            } else {
                // 不可以上传 , 文件已经上传过
                System.out.println("文件已经上传过");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 发送协议
     *
     * @param netOut          网络输出流
     * @param scanDirProtocol 协议
     * @throws IOException
     */
    private void send(OutputStream netOut, Protocol scanDirProtocol) throws IOException {
        //  scanDirProtocol对象 : scan , root
        // "type=SCAN,fileName=root,status=null,message=null,\r\n"
        String protocol = scanDirProtocol.toString();
        // "type=SCAN,fileName=root,status=null,message=null,\r\n"
        //System.out.println("客户端发送：" + protocol);
        netOut.write(protocol.getBytes());
    }
}
