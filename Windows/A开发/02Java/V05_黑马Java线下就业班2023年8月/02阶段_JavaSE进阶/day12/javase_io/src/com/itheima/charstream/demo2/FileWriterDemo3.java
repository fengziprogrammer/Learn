package com.itheima.charstream.demo2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {
    //演示：FileWriter类的基本使用
    public static void main(String[] args) throws IOException {
        //创建对象
        FileWriter fw = new FileWriter("files/hello.txt");

        //写入字符数据
        fw.write("测试数据");

        //fw.flush();//刷新流

        //释放资源
        fw.close();//在关闭流之前，会先刷新流，然后在关闭（好处：担心有数据丢失）
    }
}
