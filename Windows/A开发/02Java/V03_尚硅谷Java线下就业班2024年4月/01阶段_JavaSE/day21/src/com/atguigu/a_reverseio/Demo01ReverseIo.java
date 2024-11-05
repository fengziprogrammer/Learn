package com.atguigu.a_reverseio;

import java.io.*;

public class Demo01ReverseIo {
    public static void main(String[] args)throws Exception {
        //method01();
        method02();
    }

    private static void method02()throws Exception {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\Idea\\io\\2.txt"),"GBK");
        osw.write("你好");
        osw.close();
    }

    private static void method01()throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\Idea\\io\\1.txt"),"gbk");
        int data = isr.read();
        System.out.println((char)data);
        isr.close();
    }
}
