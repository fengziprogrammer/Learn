package com.itheima.print;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamDemo2 {
    //打印流的基本使用
    public static void main(String[] args) throws FileNotFoundException {
        //创建打印流对象
        PrintStream ps = new PrintStream("files/itheima.txt");

        //改变System.out的输出方式： 输出到文件中
        System.setOut(ps);

        System.out.println("日志信息：使用打印流...");

        //释放资源
        ps.close();


    }
}
