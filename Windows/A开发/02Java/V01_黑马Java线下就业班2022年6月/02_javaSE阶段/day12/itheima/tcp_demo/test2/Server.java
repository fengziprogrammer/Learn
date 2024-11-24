package com.itheima.tcp_demo.test2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (
                // 1 创建ServerSocket对象
                ServerSocket serverSocket = new ServerSocket(10086);
                // 2 监听客户端的连接 , 获取Socket对象
                Socket socket = serverSocket.accept();
                // 3 获取网络中的字节输入流 , 封装成高效的字节输入流
                BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                // 4 创建本地高效的字节输出流
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\liqin.jpg"));
                // 5 获取网络中的字节输出流 , 在封装成高效的字符输出流
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        ) {
            int by;// 收到的是客户端发送过来的每一个字节数据
            while ((by = bis.read()) != -1) {
                bos.write(by);
                bos.flush();
            }

            // =========================================
            // 给客户端反馈数据
            bw.write("很好看,谢谢你!");
            bw.newLine();// 必须加!!!
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
