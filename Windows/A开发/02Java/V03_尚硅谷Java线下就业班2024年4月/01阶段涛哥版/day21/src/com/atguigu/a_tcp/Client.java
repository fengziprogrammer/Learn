package com.atguigu.a_tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws Exception {
        //1.创建Socket对象,指明服务器的IP和端口号
        Socket socket = new Socket("127.0.0.1", 6666);
        //2.调用Socket中的getOutputStream,给服务器发送请求(写请求)
        OutputStream os = socket.getOutputStream();
        os.write("我想下载一个片儿".getBytes());
        //3.调用Socket中的getInputStream,用于读取服务器响应回来的数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //4.关闭资源
        is.close();
        os.close();
        socket.close();
    }
}
