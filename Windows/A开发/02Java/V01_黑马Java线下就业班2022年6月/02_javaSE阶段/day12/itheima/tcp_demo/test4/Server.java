package com.itheima.tcp_demo.test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) {
        try {
            // 创建线程池
            ExecutorService threadPool = Executors.newFixedThreadPool(10);
            // 1 创建ServerSocket对象
            ServerSocket serverSocket = new ServerSocket(10001);

            while (true) {

                // 2 监听客户端的连接 , 获取Socket对象
                Socket socket = serverSocket.accept();


                // new Thread(new ThreadServer(socket)).start();
                // 给线程池提交任务
                threadPool.submit(new ThreadServer(socket));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
