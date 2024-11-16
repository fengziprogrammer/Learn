package com.atguigu.ip;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
回忆：接触哪个包
java.lang
java.math
java.util
java.io
java.text
java.time及其子包（新版日期时间API）

java.net包
 */
public class TestInetAddress {
    @Test
    public void test01() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();//获取本地主机名和IP地址
        System.out.println(localHost);
    }

    @Test
    public void test02()throws UnknownHostException{
        InetAddress atguigu = InetAddress.getByName("www.atguigu.com");
        System.out.println(atguigu);
    }

    @Test
    public void test03()throws UnknownHostException{

//        byte[] addr = {192,168,37,105};
        byte[] addr = {(byte)192,(byte)168,37,105};
        InetAddress atguigu = InetAddress.getByAddress(addr);
        System.out.println(atguigu);
    }
}
