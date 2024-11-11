package com.itheima.tcp.demo4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.Socket;

//客户端程序
public class TcpClient {
    private static final Logger LOGGER = LoggerFactory.getLogger("TcpClient类");

    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象，连接服务端
        Socket client = new Socket("127.0.0.1", 9090);

        //基于Socket对象，获取网络输出流（发送数据）
        OutputStream netOutput = client.getOutputStream();
        //创建本地输入流（读取本地文件）
        FileInputStream fis = new FileInputStream("f:/files/123.jpg");
        //循环：读本地文件中的数据
        byte[] buf = new byte[1024];
        int len = -1;
        while ((len = fis.read(buf)) != -1) {
            //利用网络输出流，向服务端发送数据（读取的文件中的数据）
            netOutput.write(buf, 0, len);
        }

        //当文件读取结束（数据全部发送完成之后），告知服务器：数据发送结束了
        client.shutdownOutput();//通知服务器网络输出流发送结束了

        //基于Socket对象，获取网络输入流（接收数据）
        //利用网络输入流，获取服务端回馈过来的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String msg = br.readLine();//是以换行符号作为读取结束的标记（服务端程序必须发送的数据中有换行符号）
        LOGGER.trace("服务端回馈的数据：" + msg);

        //释放资源
        br.close();
        netOutput.close();
        client.close();

    }
}
