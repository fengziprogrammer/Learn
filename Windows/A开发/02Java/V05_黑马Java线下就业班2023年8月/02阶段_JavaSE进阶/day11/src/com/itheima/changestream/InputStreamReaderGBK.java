package com.itheima.changestream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderGBK {
    //使用转换流，读取编码为GBK的文本文件
    public static void main(String[] args) throws IOException {
        //创建输入流，指定关联文件的编码表名字
        InputStreamReader isr = new InputStreamReader(new FileInputStream("f:/files/GBK.txt"),"gbk");

        //一次读取一个字符数据
        int data = isr.read();

        System.out.println((char)data);

        isr.close();
    }
}
