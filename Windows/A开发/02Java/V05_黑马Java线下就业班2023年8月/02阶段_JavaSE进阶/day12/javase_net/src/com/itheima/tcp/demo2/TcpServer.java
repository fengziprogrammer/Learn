package com.itheima.tcp.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端程序
public class TcpServer {
    private static final Logger LOGGER = LoggerFactory.getLogger("TcpServer类");


    public static void main(String[] args) throws IOException {
        //创建服务端ServerSocket对象
        ServerSocket ss = new ServerSocket(9090);
        LOGGER.trace("服务端程序已启动...");

        //监听客户连接，生成Socket对象
        Socket server = ss.accept();
        LOGGER.trace(server.getInetAddress().getHostAddress() + "客户端已连接成功~");

        //基于Socket对象，获取网络输入流（接收数据）
        InputStream netInput = server.getInputStream();

        //利用网络输入流，获取客户端发送过来的数据
        byte[] buf = new byte[1024];
        int len = netInput.read(buf);
        String msg = new String(buf, 0, len);
        LOGGER.trace("客户端发送的数据：" + msg);

        //基于Socket对象，获取网络输出流（发送数据）
        OutputStream netOutput = server.getOutputStream();

        //利用网络输出流，向客户端发送数据
        netOutput.write("我不好".getBytes());

        //释放资源
        netOutput.close();
        netInput.close();
        server.close();

    }
}
