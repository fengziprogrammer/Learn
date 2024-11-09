package com.itheima.inputstream_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
     需求 : 把 "图片路径\xxx.jpg" 复制到当前模块下

    分析：
        复制文件，其实就把文件的内容从一个文件中读取出来(数据源)，然后写入到另一个文件中(目的地)
        数据源：
            xxx.jpg  --- 读数据 --- FileInputStream
        目的地：
            模块名称\copy.jpg --- 写数据 --- FileOutputStream

    数据源 : "D:\传智播客\安装包\IO资源 图片\liqin.jpg"
    目的地 : "day10_demo\copy.jpg"
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 1 创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\传智播客\\安装包\\IO资源 图片\\liqin.jpg");
        // 2 创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("day10_demo\\copy.jpg");

        // 3 一次读写一个字节
        int by;
        while((by = fis.read()) != -1){
            fos.write(by);
        }

        // 4 释放资源
        fis.close();
        fos.close();
    }
}