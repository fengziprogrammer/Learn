package com.itheima.print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    //打印流的基本使用
    public static void main(String[] args) throws FileNotFoundException {
        //创建打印流对象
        PrintStream ps = new PrintStream("files/itheima.txt");

        //向文件中写入数据（各种类型的数据）
        ps.print(100);//不换行
        ps.println(3.14);//换行
        ps.println("上海黑马");

        //释放资源
        ps.close();
    }
}
