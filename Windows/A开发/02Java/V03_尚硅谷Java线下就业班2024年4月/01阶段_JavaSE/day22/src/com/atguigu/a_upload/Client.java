package com.atguigu.a_upload;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args)throws Exception {
        //1.创建Socket对象
        Socket socket = new Socket("127.0.0.1", 6666);
        //2.创建FileInputStream读取本地图片
        FileInputStream fis = new FileInputStream("E:\\Idea\\io\\1.jpg");
        //3.调用getOutputStream将读取过来的图片写到服务端
        OutputStream os = socket.getOutputStream();
        //4.边读边写
        byte[] bytes = new byte[1000000];
        int len;
        while((len = fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }

        socket.shutdownOutput();

        System.out.println("=============以下代码是接收响应的代码===========");
        //5.调用getInputStream读取服务端传来的响应结果
        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int len1 = is.read(bytes1);
        System.out.println(new String(bytes1,0,len1));

        //6.关流
        is.close();
        os.close();
        fis.close();
        socket.close();
    }
}
