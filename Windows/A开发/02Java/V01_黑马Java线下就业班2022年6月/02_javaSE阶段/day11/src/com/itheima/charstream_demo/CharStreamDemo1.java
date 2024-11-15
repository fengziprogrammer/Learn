package com.itheima.charstream_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    思考：既然字节流可以操作所有文件，那么为什么还要学习字符流？
        1 如果使用字节流 , 把文本文件中的内容读取到内存时, 可能会出现乱码
        2 如果使用字节流 , 把中文写入文本文件中 , 也有可能会出现乱码

        需求 : 使用字节流读取当前模块下的charstream.txt文本文件 , 文件中存储的是 'abc张三'
 */
public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象
        FileInputStream fis = new FileInputStream("day11_demo\\charstream.txt");
        int by;
        while((by = fis.read()) != -1){
            System.out.print((char)by);
        }

        fis.close();
    }
}