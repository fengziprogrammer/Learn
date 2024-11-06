package com.itheima.charstream.demo1;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadChina2 {
    public static void main(String[] args) throws IOException {
        //字节输入流（读取中文数据）
        FileInputStream fis = new FileInputStream("f:/files/gbk.txt");

        byte[] buf = new byte[3];//相当于使用了：UTF-8编码表
        fis.read(buf);
        //读取字节数据
        System.out.println(new String(buf));

        fis.read(buf);
        System.out.println(new String(buf));

        //释放流
        fis.close();
    }
}
