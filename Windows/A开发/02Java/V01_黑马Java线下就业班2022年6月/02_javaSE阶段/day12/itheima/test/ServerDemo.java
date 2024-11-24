package com.itheima.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
1. TCP的服务端可以接受多个客户端的连接
2. TCP的客户端上传文件到服务器端

3. 文件保存到 c:/java/file 文件下，文件名随机生成，只要不出现文件覆盖即可。

4. 服务器端需要反馈上传状态(成功或失败)给客户端。


 */
public class ServerDemo {
    public static void main(String[] args) {

        try {
            //创建线程池
            ExecutorService threadPool = Executors.newFixedThreadPool(10);
            //创建服务端socket
            ServerSocket serverSocket = new ServerSocket(50026);
            while (true){
                Socket socket = serverSocket.accept();
                threadPool.submit(new ServerThreadPool(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
