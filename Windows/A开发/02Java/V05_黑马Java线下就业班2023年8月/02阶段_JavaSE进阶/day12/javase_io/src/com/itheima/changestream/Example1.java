package com.itheima.changestream;

import java.io.*;

public class Example1 {
    //演示：读写GBK编码表的文件
    public static void main(String[] args) throws IOException {
        //创建输出流，指定关联文件的编码表名字
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("f:/files/heima.txt"),"gbk");
        //写入数据
        osw.write("上海黑马程序员");
        //关闭流
        osw.close();


        //创建输入流，指定关联文件的编码表名字
        InputStreamReader isr = new InputStreamReader(new FileInputStream("f:/files/heima.txt"),"gbk");
        //读数据
        int data = isr.read();
        //关闭流
        isr.close();


        System.out.println((char)data);
    }
}
