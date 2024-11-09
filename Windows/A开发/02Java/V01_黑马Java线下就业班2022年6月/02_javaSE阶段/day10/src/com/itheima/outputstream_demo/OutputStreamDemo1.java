package com.itheima.outputstream_demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节输出流写数据快速入门
            第一部分 : 字节输出流类
                 OutputStream类 : 字节输出流最顶层的类 , 抽象类
                    public class FileOutputStream  extends  OutputStream

            第二部分 : 构造方法
                 FileOutputStream类 :
                 public FileOutputStream(File file) : 往file类型的路径中写入数据
                 public FileOutputStream(String name) : 往String类型的路径中写入数据

            第三部分 : 字节输出流步骤
                1 创建字节输出流对象
                2 写数据
                3 释放资源

        'a' = 97 ...
        'A' = 65 ...
        '0' = 48 ...
 */
public class OutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建字节输出流对象
        // public FileOutputStream(String name) : 往String类型的路径中写入数据
        /*
            如果字节输出流指向的文件不存在 , 那么会创建一个空的文件
            如果字节输出流指向的文件存在, 那么会把文件中数据清空
         */
        FileOutputStream fos = new FileOutputStream("day10_demo\\abc.txt");

        // 写数据
        fos.write(97);
        fos.write(98);
        fos.write(99);

        // while(true){}
        // 释放资源
        fos.close();
    }
}