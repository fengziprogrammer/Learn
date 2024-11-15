package com.itheima.reader_demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    Reader类 : 读取字符流的最顶层的类 , 是一个抽象类 ,不能实例化
    需要使用其子类FileReader类

    FileReader类 : 用来读取字符文件的便捷类

    构造方法 :
        public FileReader(File file) : 从指定的File路径中读取数据
        public FileReader(String fileName) : 从指定的String路径中读取数据

    成员方法 :
        int read() : 一次读一个字符数据 , 如果读到文件的末尾 , 则返回-1
        int read(char[] cbuf)	 : 一次读一个字符数组数据

    数据源 : 斗罗大陆.txt
    目的地 : 直接输出打印在控制台

 */
public class ReaderDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建字符输入流对象
        //  public FileReader(String fileName) : 从指定的String路径中读取数据
        FileReader fr = new FileReader("D:\\传智播客\\上海-JavaSE进阶面授\\上海校区就业141期\\day11【缓冲流、转换流、序列化流、装饰者模式、commons-io工具包】\\04_资料\\斗罗大陆.txt");

        // int read() : 一次读一个字符数据 , 如果读到文件的末尾 , 则返回-1
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }

        // 释放资源
        fr.close();
    }
}