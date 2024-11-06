package com.itheima.charstream.demo3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //创建： 字符输入流
        FileReader fr = new FileReader("files/hello.txt");

        //操作： 读字符数据
        int data = fr.read();
        System.out.println((char)data);

        //关闭： 释放流资源
        fr.close();
    }
}
