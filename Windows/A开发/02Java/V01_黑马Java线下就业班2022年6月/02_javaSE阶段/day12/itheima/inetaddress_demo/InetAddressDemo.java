package com.itheima.inetaddress_demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    InetAddress类 : 此类表示Internet协议（IP）地址
       1 static InetAddress getByName​(String host)	在给定主机名的情况下获取InetAddress类的对象
       2 String getHostName​()	 : 获取此 IP 地址的主机名
       3 String getHostAddress​()	: 返回 IP 地址字符串（以文本表现形式）。
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        // 1 static InetAddress getByName​(String host)	在给定主机名的情况下获取InetAddress类的对象
        // InetAddress inetAddress = InetAddress.getByName("LAPTOP-8JCLOAJ2");
        InetAddress inetAddress = InetAddress.getByName("192.168.139.28");

        //  2 String getHostName​()	 : 获取此 IP 地址的主机名
        System.out.println(inetAddress.getHostName());

        // 3 String getHostAddress​()	: 返回 IP 地址字符串（以文本表现形式）。
        System.out.println(inetAddress.getHostAddress());

    }
}
