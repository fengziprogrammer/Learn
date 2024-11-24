package com.itheima.tcp_demo.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
     基于TCP协议
     服务端接收数据 :

    1 创建服务器端的Socket对象 : ServerSocket类
        ServerSocket​(int port)  : 构造方法需要绑定一个端口号 , port就是端口号

    2 监听客户端连接,并接受连接，返回一个Socket对象
        Socket accept​() : 该方法会一直阻塞直到建立连接

    3 获取网络中的输入流，用来读取客户端发送过来的数据
        InputStream getInputStream​()

    4 释放资源 : 服务端一般不会关闭
        void close​()
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 1 创建服务器端的Socket对象 : ServerSocket类
        ServerSocket serverSocket = new ServerSocket(10010);

        // 2 监听客户端连接,并接受连接，返回一个Socket对象
        Socket socket = serverSocket.accept();// 具备阻塞

        // 3 获取网络中的输入流，用来读取客户端发送过来的数据
        InputStream is = socket.getInputStream();

        System.out.println("while循环执行前...");
        // 读数据
        int by;
        // read方法具备阻塞作用
        while ((by = is.read()) != -1) {
            System.out.print((char) by);
        }

        System.out.println("while循环执行后...");

        // 释放资源
        is.close();
        socket.close();
        serverSocket.close();
    }
}
