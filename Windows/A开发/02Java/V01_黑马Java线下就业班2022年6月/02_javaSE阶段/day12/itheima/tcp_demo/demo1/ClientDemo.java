package com.itheima.tcp_demo.demo1;

import java.io.IOException;
import java.io.OutputStream;
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
    public static void main(String[] args) throws IOException {
        // 1 创建客户端的Socket对象 : Socket(String host, int port) 与指定服务端连接
        Socket socket = new Socket("127.0.0.1", 10010);

        // 2 通获Socket对象取网络中的输出流，写数据
        OutputStream os = socket.getOutputStream();
        // 调用writer方法进行发送数据
        os.write("hello".getBytes());
        os.flush();// 网络中的流无论是字节还是字符 , 发送数据必须刷新
        socket.shutdownOutput();// 给服务端写一个结束标记

        while(true){}

        // 3 释放资源
//        os.close();// 关流 , 会自动发送结束标记
//        socket.close();
    }
}
