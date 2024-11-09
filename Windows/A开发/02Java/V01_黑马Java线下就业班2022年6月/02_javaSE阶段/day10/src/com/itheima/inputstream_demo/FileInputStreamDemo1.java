package com.itheima.inputstream_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    字节输入流写数据快速入门 : 一次读一个字节
            第一部分 : 字节输入流类
                InputStream类 : 字节输入流最顶层的类 , 抽象类
                    --- FileInputStream类 : FileInputStream extends InputStream

            第二部分 : 构造方法
                public FileInputStream(File file) :  从file类型的路径中读取数据
                public FileInputStream(String name) : 从字符串路径中读取数据

                读数据的方法 :
                    public int read() : 从此输入流中读取一个数据字节 , 读不到数据会返回-1

            第三部分 : 字节输入流步骤
                1 创建输入流对象
                2 读数据
                3 释放资源
 */
public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 1 创建字节输入流对象
        // 字节输入流指向的文件如果不存在报错!!!
        FileInputStream fis = new FileInputStream("day10_demo\\abc.txt");

        // 2 读数据
        //  public int read() : 从此输入流中读取一个数据字节 , 读不到数据会返回-1
//        int by = fis.read();
//        System.out.print((char)by);
//        by = fis.read();
//        System.out.print((char)by);
//        by = fis.read();
//        System.out.print((char)by);
//        by = fis.read();
//        System.out.print((char)by);
//        by = fis.read();
//        System.out.print((char)by);
//        by = fis.read();
//        System.out.print((char)by);
//        by = fis.read();
//        System.out.print((char)by);
//        by = fis.read();
//        System.out.print((char)by);
//
//        by = fis.read();
//        System.out.print(by);

//        while (true) {
//            int by = fis.read();
//            if (by != -1) {
//                System.out.print((char) by);
//            } else {
//                break;
//            }
//        }

        // 记录的是每次读取到的字节数据
        int by;
        // by = fis.read()
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }

        // 3 释放资源
        fis.close();
    }
}