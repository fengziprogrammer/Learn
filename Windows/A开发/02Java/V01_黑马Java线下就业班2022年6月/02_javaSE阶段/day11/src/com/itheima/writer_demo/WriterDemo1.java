package com.itheima.writer_demo;

import java.io.FileWriter;
import java.io.IOException;

/*
    Writer类 : 写入字符流的最顶层的类 , 是一个抽象类 ,不能实例化
    需要使用其子类FileWriter类

    FileWriter类 : 用来写入字符文件的便捷类
    构造方法 :
        public FileWriter(File file) : 往指定的File路径中写入数据
        public FileWriter(String fileName) : 往指定的String路径中写入数据

    成员方法
        void write(int c)	写一个字符
        void write(char[] cbuf)	写入一个字符数组
        void write(char[] cbuf, int off, int len)	写入字符数组的一部分
        void write(String str)	写一个字符串
        void write(String str, int off, int len)	写一个字符串的一部分

        flush()	刷新流，还可以继续写数据
        close()	关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据
 */
public class WriterDemo1 {
    public static void main(String[] args) throws IOException {
        // 1 创建字符输出流对象
        // public FileWriter(String fileName) : 往指定的String路径中写入数据
        // 输出流指向的文件不存在会自动创建 , 如果存在则清空文件
        FileWriter fw = new FileWriter("day11_demo\\a.txt");
        // 2 写数据
        fw.write("abc");
        // flush()	刷新流，还可以继续写数据
        // fw.flush();

        // 3 释放资源
        fw.close();
    }
}