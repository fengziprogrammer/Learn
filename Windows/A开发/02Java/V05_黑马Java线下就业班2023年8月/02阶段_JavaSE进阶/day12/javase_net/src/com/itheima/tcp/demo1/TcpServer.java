package com.itheima.tcp.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端程序
public class TcpServer {
    public static void main(String[] args) throws IOException {
        //创建服务端ServerSocket对象
        ServerSocket ss = new ServerSocket(9090);
        System.out.println("服务端程序已启动...");

        //监听客户连接，生成Socket对象
        Socket server = ss.accept();//进入到阻塞状态（解除阻塞：客户端连接）
        System.out.println(server.getInetAddress().getHostAddress()+"客户端连接成功~");


        //基于Socket对象，获取网络输入流（接收数据）
        InputStream netInput = server.getInputStream();

        //利用网络输入流，获取客户端发送过来的数据
        byte[] buf= new byte[1024];
        int len = netInput.read(buf);
        String msg = new String(buf,0, len);

        System.out.println("客户端发送的数据："+msg);

        //释放资源
        netInput.close();
        server.close();//关闭服务端socket

    }
}
