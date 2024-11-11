package com.itheima.charstream.demo3;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo3 {
    public static void main(String[] args) throws IOException {
        //创建： 字符输入流
        FileReader fr = new FileReader("files/hello.txt");

        //操作： 读字符数据
        char[] cbuf = new char[2];
        int len = -1;
        while((len=fr.read(cbuf)) != -1){
            String str = new String(cbuf,0,len);
            System.out.println(str);
        }

        //关闭： 释放流资源
        fr.close();
    }
}
