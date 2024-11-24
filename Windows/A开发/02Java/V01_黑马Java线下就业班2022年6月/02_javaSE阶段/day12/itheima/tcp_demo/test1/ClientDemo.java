package com.itheima.tcp_demo.test1;

import java.io.*;
import java.net.Socket;

/*
    TCP协议 : 面向连接
    客户端 : 发送数据

    发送数据的步骤
        1 创建客户端的Socket对象 : Socket(String host, int port) 与指定服务端连接
            参数说明：
            host 表示服务器端的主机名，也可以是服务器端的IP地址，只不过是String类型的
            port 表示服务器端的端口

        2 通获Socket对象取网络中的输出流，写数据
            OutputStream getOutputStream​()

        3 释放资源
            void close​()
 */
public class ClientDemo {
    public static void main(String[] args) {
        try (
                // 1 创建客户端的Socket对象
                Socket socket = new Socket("127.0.0.1", 10010);
                //  2 通获Socket对象取网络中的输出流，写数据
//                OutputStream os = socket.getOutputStream();
//                // 把网络中的字节输出流封装成高效的字符输出流
//                OutputStreamWriter osw = new OutputStreamWriter(os);
//                BufferedWriter bw = new BufferedWriter(osw);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                // 获取高效的字符输入流
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            // 发送数据
            bw.write("你好啊~");
            bw.newLine();// 换行
            bw.flush();

            // =================================================================

            // 等待服务端反馈数据
            String s = br.readLine();
            System.out.println("服务端反馈的数据为:" + s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
