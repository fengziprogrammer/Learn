package com.itheima.tcp_demo.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
    public static void main(String[] args) {
        try (
                // 1 创建服务器端的Socket对象 : ServerSocket类
                ServerSocket serverSocket = new ServerSocket(10010);
                // 2 监听客户端连接,并接受连接，返回一个Socket对象
                Socket socket = serverSocket.accept();
                // 3 把网络中的字节输入流封装成高效的字符输入流
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                // 获取高效的字符输出流
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        ) {
            // 4 读数据 , readLine认为读到换行符才认为是一行数据
            String s = br.readLine();
            System.out.println("客户端发送的数据为:" + s);

            // ================================================

            // 给客户端反馈数据
            bw.write("你谁啊?");
            bw.newLine();
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
