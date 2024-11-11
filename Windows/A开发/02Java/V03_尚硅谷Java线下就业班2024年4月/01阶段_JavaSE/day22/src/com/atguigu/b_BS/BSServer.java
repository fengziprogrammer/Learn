package com.atguigu.b_BS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1.问题: 根据浏览器发送过来的请求发现,我们只需要第一行数据即可
 *        因为第一行有我们想要的资源路径,我们就可以利用readLine,读取第一行数据
 *        我们如何将InputStream转成BufferedReader
 *
 * 2.解决:
 *   a.BufferedReader构造: BufferedReader(Reader r)
 *   b.如果我们new BufferedReader的时候,我们想办法将InputStream放到BufferedReader的构造中即可
 *
 * 3.怎么将InputStream放到BufferedReader构造中
 *   a.原来我们new BufferedReader时,传递的是FileReader,但是FileReader是InputStreamReader的子类
 *     而InputStreamReader是Reader的子类,所以我们传递InputStreamReader也行
 *
 *   b.new BufferedReader(new InputStreamReader(InputStream))
 *
 */
public class BSServer {
    public static void main(String[] args)throws Exception {
        //1.创建ServerSocket对象,指定端口号
        ServerSocket ss = new ServerSocket(8888);

        while(true){
            //2.获取连接过来的客户端对象
            Socket socket = ss.accept();
            //3.调用getInputStream,读取浏览器发送过来的请求
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String s = br.readLine();// GET /day22_jdk/web/index.html HTTP/1.1

        /*
          s.split(" ") -> 代表一个数组
          数组中的元素为:[GET,/day22_jdk/web/index.html,HTTP/1.1]
         */
            String s1 = s.split(" ")[1];// /day22_jdk/web/index.html

            String path = s1.substring(1); // day22_jdk/web/index.html

            //4.根据解析出来的路径,读取html
            FileInputStream fis = new FileInputStream(path);

            OutputStream os = socket.getOutputStream();

            //给浏览器先写一个响应信息
            os.write("HTTP/1.1 200 OK\r\n".getBytes());
            os.write("Content-Type:text/html\r\n".getBytes());
            os.write("\r\n".getBytes());

            //5.边读边写
            byte[] bytes = new byte[1024];
            int len;
            while((len = fis.read(bytes))!=-1){
                os.write(bytes,0,len);
            }

            //6.关流
            os.close();
            fis.close();
            br.close();
            is.close();
            socket.close();
        }

    }
}
