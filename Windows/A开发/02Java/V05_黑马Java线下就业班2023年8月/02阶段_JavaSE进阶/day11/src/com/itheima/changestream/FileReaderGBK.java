package com.itheima.changestream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderGBK {
    //使用普通的FileReader字符流，读取编码为GBK的文本文件
    public static void main(String[] args) throws IOException {
        //创建FileReader对象 （FileReader类默认的编码表为：UTF-8）
        FileReader fr = new FileReader("f:/files/GBK.txt");

        //一次读取一个字符数据
        int data = fr.read();

        System.out.println((char)data);

        fr.close();
    }
}
