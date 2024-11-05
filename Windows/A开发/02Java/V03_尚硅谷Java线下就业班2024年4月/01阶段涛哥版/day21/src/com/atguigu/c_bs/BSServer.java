package com.atguigu.c_bs;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * 1.我们想要的是调用BufferedReader中的readLine()方法,读取请求报文中的第一行数据
 *   GET /day21_Net/web/index.html HTTP/1.1
 *
 * 2.我们需要将InputStream转成BufferedReader对象,
 *   我们只需要想办法将InputStream放到BufferedReader的构造中就行了
 *
 * 3.BufferedReader的构造:
 *   BufferedReader(Reader r)
 *                  Reader的子类: FileReader
 *                               InputStreamReader->传递此转换流对象到BufferedReader中
 * 4.InputStreamReader构造:
 *   InputStreamReader(InputStream in)
 *
 * 5.怎么将InputStream转成BufferedReader
 *   new BufferedReader(new InputStreamReader(InputStream))
 *
 *
 *
 */
public class BSServer {
    public static void main(String[] args)throws Exception {
        //1.创建ServerSocket对象
        ServerSocket ss = new ServerSocket(8888);

        while(true){
            //2.调用accept,等待客户端连接
            Socket socket = ss.accept();
            //3.调用getInputStream,读取浏览器发送过来的请求
            InputStream in = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String s = br.readLine();//  GET /day21_Net/web/index.html HTTP/1.1
            String[] arr = s.split(" ");
            String s1 = arr[1];
            String path = s1.substring(1);//   day21_Net/web/index.html

            //4.根据解析出来的路径,创建FileInputStream读取本地上的html
            FileInputStream fis = new FileInputStream(path);
            //5.调用getOutputStream,将读取到的html写到浏览器上面
            OutputStream os = socket.getOutputStream();

            //给浏览器先写一个响应信息
            os.write("HTTP/1.1 200 OK\r\n".getBytes());
            os.write("Content-Type:text/html\r\n".getBytes());
            os.write("\r\n".getBytes());

            //6.边读边写
            byte[] bytes = new byte[1024];
            int len;
            while((len = fis.read(bytes))!=-1){
                os.write(bytes,0,len);
            }
            //7.关闭资源
            os.close();
            fis.close();
            br.close();
            in.close();
            socket.close();
        }

    }
}
