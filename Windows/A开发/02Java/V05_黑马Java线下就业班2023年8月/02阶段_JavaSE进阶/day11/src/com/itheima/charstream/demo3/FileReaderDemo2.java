package com.itheima.charstream.demo3;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        //创建： 字符输入流
        FileReader fr = new FileReader("files/hello.txt");

        //操作： 读字符数据
        char[] cbuf = new char[2];
        int len = fr.read(cbuf);
        System.out.println("第1次读取到的字符数据个数：" + len);
        System.out.println("第1次读取到的字符数据：" + new String(cbuf, 0, len));


         len = fr.read(cbuf);
        System.out.println("第2次读取到的字符数据个数：" + len);
        System.out.println("第2次读取到的字符数据：" + new String(cbuf, 0, len));


         len = fr.read(cbuf);
        System.out.println("第3次读取到的字符数据个数：" + len);
        System.out.println("第4次读取到的字符数据：" + new String(cbuf, 0, len));

        //关闭： 释放流资源
        fr.close();
    }
}
