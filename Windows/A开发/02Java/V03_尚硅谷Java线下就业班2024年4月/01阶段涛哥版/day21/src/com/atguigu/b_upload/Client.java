package com.atguigu.b_upload;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws Exception {
        //1.创建Socket对象,指明服务端IP和端口号
        Socket socket = new Socket("127.0.0.1", 6666);
        //2.创建FileInputStream,用于读取本地上的图片
        FileInputStream fis = new FileInputStream("E:\\Idea\\io\\27.jpg");
        //3.调用getOutputStream用于将读取过来的图片写到服务端
        OutputStream os = socket.getOutputStream();
        //4.边读边写
        byte[] bytes1 = new byte[1024];
        int len;
        while((len = fis.read(bytes1))!=-1){
            os.write(bytes1,0,len);
        }

        socket.shutdownOutput();

        System.out.println("============以下代码为读取响应结果=============");

        //5.调用getInputStream,用于读取服务端发送过来的响应结果
        InputStream is = socket.getInputStream();
        byte[] bytes2 = new byte[1024];
        int len2 = is.read(bytes2);
        System.out.println(new String(bytes2,0,len2));

        //6.关闭资源
        is.close();
        os.close();
        fis.close();
        socket.close();

    }
}
