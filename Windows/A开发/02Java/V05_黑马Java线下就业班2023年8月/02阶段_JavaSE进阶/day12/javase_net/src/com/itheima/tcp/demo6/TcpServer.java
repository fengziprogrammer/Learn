package com.itheima.tcp.demo6;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

//服务端程序
public class TcpServer {
    private static final Logger LOGGER = LoggerFactory.getLogger("TcpServer类");


    public static void main(String[] args) throws IOException {
        //创建服务端ServerSocket对象
        ServerSocket ss = new ServerSocket(9090);
        LOGGER.trace("服务端程序已启动...");

        while(true) {
            //监听客户连接，生成Socket对象
            Socket server = ss.accept();
            LOGGER.trace(server.getInetAddress().getHostAddress() + "客户端已连接成功~");

            //开启新线程处理：文件上传
            new Thread(  new UploadTask(server,LOGGER)  ).start();;
        }
    }
}
