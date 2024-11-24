package com.itheima.udp_demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(10086);

        byte[] bys = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bys, bys.length);

        datagramSocket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();

        System.out.println(new String(data, 0, datagramPacket.getLength()));

        datagramSocket.close();

    }
}
