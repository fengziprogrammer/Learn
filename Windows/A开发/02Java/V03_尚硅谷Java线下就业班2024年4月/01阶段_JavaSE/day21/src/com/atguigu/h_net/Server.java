package com.atguigu.h_net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)throws Exception {
        //a.创建ServerSocket,指定端口号
        ServerSocket ss = new ServerSocket(6666);
        //b.调用accept方法,等待连接过来的客户端对象,此方法返回一个Socket对象, 如果没有客户端连接,此方法将等待
        Socket socket = ss.accept();
        //c.调用socket中的getInputStream,读取客户端发过来的请求
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //d.调用socket中的getOutputStream,给客户端写一个结果(回响应)
        OutputStream os = socket.getOutputStream();
        os.write("给你一个片儿,高清无码".getBytes());
        //e.关流
        os.close();
        is.close();
        socket.close();
        ss.close();
    }
}
