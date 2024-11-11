package com.itheima.charstream.demo2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
    //演示：FileWriter类的基本使用
    public static void main(String[] args) throws IOException {
        //创建对象
        FileWriter fw = new FileWriter("files/hello.txt", true);//追加写入

        //写入字符数据
        fw.write("测试数据");


        //释放资源
        fw.close();
    }
}
