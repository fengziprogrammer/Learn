package com.atguigu.h_net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws Exception {
        //a.创建Socket对象,指定服务端的IP,以及端口号
        Socket socket = new Socket("127.0.0.1", 6666);
        //b.调用Socket中的getOutputStream,获取OutputStream,用于往服务端写数据(发请求)
        OutputStream os = socket.getOutputStream();
        os.write("我想下载一个片儿".getBytes());
        //c.调用Socket中的getInputStream,获取InputStream,用于读取服务端发送过来的结果(读响应)
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //d.关流
        os.close();
        os.close();
        socket.close();
    }
}
