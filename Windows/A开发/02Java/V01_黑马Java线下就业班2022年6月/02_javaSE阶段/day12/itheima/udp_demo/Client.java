package com.itheima.udp_demo;

import java.io.IOException;
import java.net.*;
import java.util.Date;
import java.util.Random;

/*
    UDP : 面向无连接  , 发送数据不能超过64k  , 速度较快 , 数据可能会丢失

    单播
    组播
    广播
 */
public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        // 数据包
        byte[] bytes = "hello".getBytes();
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        DatagramPacket datagramPacket = new DatagramPacket(bytes , 0 , bytes.length , inetAddress , 10086);

        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
