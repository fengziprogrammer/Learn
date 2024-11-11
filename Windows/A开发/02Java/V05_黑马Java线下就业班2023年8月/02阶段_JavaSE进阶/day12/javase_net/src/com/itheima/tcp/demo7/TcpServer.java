package com.itheima.tcp.demo7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//服务端程序
public class TcpServer {
    private static final Logger LOGGER = LoggerFactory.getLogger("TcpServer类");


    public static void main(String[] args) throws IOException {
        //创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(20);

        //创建服务端ServerSocket对象
        ServerSocket ss = new ServerSocket(9090);
        LOGGER.trace("服务端程序已启动...");

        while(true) {
            //监听客户连接，生成Socket对象
            Socket server = ss.accept();
            LOGGER.trace(server.getInetAddress().getHostAddress() + "客户端已连接成功~");

            //使用线程池，处理文件上传任务
            es.submit( new UploadTask(server,LOGGER)  );
        }
    }
}
