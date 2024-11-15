package com.itheima.printstream_demo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    PrintStream类 : 打印流

    作用 : 就是为了方便记录数据（日志）

    构造方法 :
        public PrintStream(String filePath) : 构建一个打印流对象，传入接收数据的文件路径
    成员方法 :
        public void println(数据)   打印后换行
        public void print(数据)     打印不换行

    需求 : 创建打印流对象，记录一些数据到指定文件
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // System.out.println("abc");

        //  public PrintStream(String filePath) : 构建一个打印流对象，传入接收数据的文件路径
        PrintStream ps = new PrintStream("day11_demo\\print.txt");

        ps.println(123);
        ps.println(true);
        ps.println("abc");

        ps.close();
    }
}
