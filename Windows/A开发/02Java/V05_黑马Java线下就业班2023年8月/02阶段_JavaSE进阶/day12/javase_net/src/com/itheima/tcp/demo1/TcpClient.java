package com.itheima.tcp.demo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

//客户端程序
public class TcpClient {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象，连接服务端
        Socket client=new Socket("127.0.0.1",9090);

        //基于Socket对象，获取网络输出流（发送数据）
        OutputStream netOutput = client.getOutputStream();

        //利用网络输出流，向服务端发送数据
        netOutput.write("你好".getBytes());

        //释放资源
        netOutput.close();
        client.close();//关闭客户端
    }
}
