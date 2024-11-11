package com.itheima.tcp.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//客户端程序
public class TcpClient {
    private static final Logger LOGGER = LoggerFactory.getLogger("TcpClient类");

    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象，连接服务端
        Socket client = new Socket("127.0.0.1",9090);

        //基于Socket对象，获取网络输出流（发送数据）
        OutputStream netOutput = client.getOutputStream();

        //利用网络输出流，向服务端发送数据
        netOutput.write("你好".getBytes());

        //基于Socket对象，获取网络输入流（接收数据）
        InputStream netInput = client.getInputStream();

        //利用网络输入流，获取服务端回馈过来的数据
        byte[] buf = new byte[1024];
        int len = netInput.read(buf);
        String msg = new String(buf, 0, len);
        LOGGER.trace("服务端回馈的数据：" + msg);

        //释放资源
        netInput.close();
        netOutput.close();
        client.close();

    }
}
