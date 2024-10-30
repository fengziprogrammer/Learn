package com.atguigu.b_zhuanhuan;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo01InputStreamReader {
    public static void main(String[] args)throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\Idea\\io\\upload\\1.txt"),"gbk");
        int data = isr.read();
        System.out.println((char)data);
        isr.close();
    }
}
