package com.itheima.charstream.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadChina {
    public static void main(String[] args) throws IOException {
        //字节输入流（读取中文数据）
        FileInputStream fis = new FileInputStream("files/hello.txt");

        //读取字节数据
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());

        //释放流
        fis.close();
    }
}
