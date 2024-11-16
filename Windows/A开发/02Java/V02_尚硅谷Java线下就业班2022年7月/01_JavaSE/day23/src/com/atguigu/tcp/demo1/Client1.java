package com.atguigu.tcp.demo1;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
需求：
（1）与服务器建立连接，或者说和服务器发起连接请求
（2）直接接收服务器发过来的“欢迎登录”
(3)断开
 */
public class Client1 {
    public static void main(String[] args) throws Exception {
        //两个参数分别表示：服务器端的IP地址，和端口号
        //因为现在是我自己电脑上的两个程序连接，所以用本地的IP地址
        //如果大家练习时，是连接同桌的电脑上的服务器程序，这里就要用同桌的IP地址
        Socket socket  = new Socket(InetAddress.getLocalHost(),8888);

        InputStream in = socket.getInputStream();//获取字节输入流，用于读取数据
        byte[] data = new byte[1024];
        int len;
        while((len = in.read(data)) != -1){
            System.out.println(new String(data,0, len));
        }

        //如果后面不和这个服务器通信了，就要关闭socket
        socket.close();
    }
}
