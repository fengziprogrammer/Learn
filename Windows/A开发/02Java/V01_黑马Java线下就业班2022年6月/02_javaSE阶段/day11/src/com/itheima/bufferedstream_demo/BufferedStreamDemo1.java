package com.itheima.bufferedstream_demo;

import java.io.*;

/*
    1 字符缓冲流：
        BufferedWriter：可以将数据高效的写出
        BufferedReader：可以将数据高效的读入到内存


    2 注意 :  字符缓冲流不具备读写功能 , 只提供缓冲区 , 真正读写还是需要依赖于构造接收的基本的字符流

    3 构造方法：
        public BufferedWriter(Writer out) : 构造方法中需要接收一个基本的字符输出流
        public BufferedReader(Reader in) : 构造方法中需要接收一个基本的字符输入流

    需求 : 使用字符缓冲流复制纯文本文件
    将当日课程资料中的 ‘斗罗大陆.txt’ 复制到当前模块下 'copy.txt'

    数据源 : 斗罗大陆.txt
    目的地 : day11_demo\copy.txt

 */
public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 1 创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\传智播客\\上海-JavaSE进阶面授\\上海校区就业141期\\day11【缓冲流、转换流、序列化流、装饰者模式、commons-io工具包】\\04_资料\\斗罗大陆.txt"));
        //   创建字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11_demo\\爱情大陆.txt"));

        // 2 一次读写一个字符
//        int ch;
//        while((ch = br.read()) != -1){
//            bw.write(ch);
//            bw.flush();
//        }

        // 一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while((len = br.read(chs)) != -1){
            bw.write(chs , 0 , len);
            bw.flush();
        }

        // 3 释放资源
        br.close();
        bw.close();
    }
}