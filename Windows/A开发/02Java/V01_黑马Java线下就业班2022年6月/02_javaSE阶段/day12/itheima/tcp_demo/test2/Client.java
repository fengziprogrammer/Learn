package com.itheima.tcp_demo.test2;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (
                // 1 创建本地的字节输入流
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\传智播客\\安装包\\好看的图片\\liqin.jpg"));
                // 2 创建Socket对象
                Socket socket = new Socket("127.0.0.1", 10086);
                // 3 获取网络中的字节输出流 , 在封装成高效的字节输出流
                BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
                // 4 获取网络中的字节输入流 , 在封装高效的字符输入流
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            int by;// 记录的是本地流每次读到的字节数据
            while ((by = bis.read()) != -1) {
                bos.write(by);
                bos.flush();
            }
            socket.shutdownOutput();// 给服端发送结束标记

            // ================================================
            // 等待服务的反馈
            String s = br.readLine();
            System.out.println("服务端反馈数据:" + s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
