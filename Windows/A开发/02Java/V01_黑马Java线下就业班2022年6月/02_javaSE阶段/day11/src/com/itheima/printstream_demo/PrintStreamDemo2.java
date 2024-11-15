package com.itheima.printstream_demo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    PrintStream类 : 打印流

    构造方法 :
        public PrintStream(String filePath) : 构建一个打印流对象，传入接收数据的文件路径
    成员方法 :
        public void println(数据)   打印后换行
        public void print(数据)     打印不换行
    需求 :
        System.out 对象类型，其实就是PrintStream类型。
        可以改变系统输出的流向 : System.setOut(打印流)
 */
public class PrintStreamDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("数据打印在控制台");

        // 可以改变系统输出的流向
        System.setOut(new PrintStream("day11_demo\\print.txt"));

        System.out.println("数据打印在文件中");
    }
}
