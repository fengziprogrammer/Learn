package com.itheima.outputstream_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据的3种方式
        1 void write(int b)	一次写一个字节数据
        2 void write(byte[] b)	一次写一个字节数组数据
        3 void write(byte[] b, int off, int len)	一次写一个字节数组的部分数据

        问题 : 字节输出流是否可以写入字符串 ????
            String类 : public byte[] getBytes() : 把字符串转成字节数组

        97 - 'a'  , 98 - 'b' ...
        65 - 'A'  , 66 - 'B' ...
        48 - '0'  , 49 - '1' ...
 */
public class OutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 1 创建字节输出流对象
        // public FileOutputStream(File file)
        // FileOutputStream fos = new FileOutputStream(new File("day10_demo\\abc.txt"));
        FileOutputStream fos = new FileOutputStream("day10_demo\\abc.txt");

        // 2 写数据
        // 1) void write(int b)	一次写一个字节数据
//        fos.write(65);
//        fos.write(66);
//        fos.write('c');

        byte[] bys = {65,66,67,68,69,70};
        // 2) void write(byte[] b)	一次写一个字节数组数据
//        fos.write(bys);

        // 3 void write(byte[] b, int off, int len)	一次写一个字节数组的部分数据
//        fos.write(bys , 2 , 3);

//        byte[] bytes = "abc".getBytes();// {97 , 98 . 99}
//        fos.write(bytes);
        fos.write("sdfghjkl345678dfghjk".getBytes());

        // 3 释放资源
        fos.close();
    }
}