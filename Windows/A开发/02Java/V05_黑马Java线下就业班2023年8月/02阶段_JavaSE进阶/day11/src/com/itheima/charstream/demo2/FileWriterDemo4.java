package com.itheima.charstream.demo2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo4 {
    public static void main(String[] args) throws IOException {
        String name ="黑马";
        String password="itheima";

        //创建：字符输出流
        FileWriter fw = new FileWriter("files/hello.txt");

        //操作：写入字符数据
        fw.write(name);
        fw.write("\r\n");//写入换行符号
        fw.write(password);

        //释放资源
        fw.close();
    }
}
