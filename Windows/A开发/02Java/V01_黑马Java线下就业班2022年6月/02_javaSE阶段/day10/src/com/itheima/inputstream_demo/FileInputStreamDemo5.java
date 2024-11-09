package com.itheima.inputstream_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
   FileInputStream类 :
        public int read(byte[] b)：
            1 从输入流读取最多b.length个字节的数据
            2 返回的是真实读到的数据个数
            3 如果不到数据 , 那么会返回-1

   需求1 : 在当前模块下创建一个文件 , 文件存储数据hello world , 定义长度为5的字节数组进行读取数据

   String类
        public String(byte[] bys) : 把字节数组中的内容转成一个字符串
        public String(byte[] bytes, int startIndex, int length) : 把字节数组的一部分转成字符串
 */
public class FileInputStreamDemo5 {
    public static void main(String[] args) throws IOException {
        // 1 创建字节输入流对象
        FileInputStream fis = new FileInputStream("day10_demo\\abc.txt"); // 2000字节

        byte[] bys = new byte[1024];// 1024字节   976字节
        // 记录的是每次真实读到数据的个数
        int len;// 1024  976
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys , 0 , len));
        }

        // 释放资源
        fis.close();


//        byte[] bys = new byte[5];
//        // public int read(byte[] b)：
//        int len = fis.read(bys);
//        // System.out.println(len);
//        System.out.print(new String(bys, 0, len));
//
//        len = fis.read(bys);
//        // System.out.println(len);
//        System.out.print(new String(bys, 0, len));
//
//        len = fis.read(bys);
//        // System.out.println(len);// 4
//        System.out.print(new String(bys, 0, len));
    }
}