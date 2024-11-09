package com.itheima.outputstream_demo;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据的换行和追加写入

    1 字节流写数据如何实现换行呢？
        写完数据后，加换行符
        windows : \r\n
        linux : \n
        mac : \r

    2 字节流写数据如何实现追加写入呢？
        通过构造方法 : public FileOutputStream(String name，boolean append)
        创建文件输出流以指定的名称写入文件。如果第二个参数为true ，不会清空文件里面的内容, 追加写数据
 */
public class OutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 1 创建字节输出流对象
        // 通过构造方法 : public FileOutputStream(String name，boolean append)
        FileOutputStream fos = new FileOutputStream("day10_demo\\abc.txt", true);

        // 2 写数据
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }

        // 3 释放资源
        fos.close();
    }
}