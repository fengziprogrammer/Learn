package com.itheima.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test1 {
    public static void main(String[] args) throws UnknownHostException {
        //获取IP地址对象
        InetAddress ipObj = InetAddress.getByName("192.168.32.60");//OJIS7TLX05DN3FH

        System.out.println("计算机名字："+ipObj.getHostName());
        System.out.println("IP地址："+ipObj.getHostAddress());
    }
}
