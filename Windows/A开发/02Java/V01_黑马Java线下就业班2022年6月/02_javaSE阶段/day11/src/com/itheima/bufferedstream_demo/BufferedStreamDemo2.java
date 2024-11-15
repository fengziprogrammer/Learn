package com.itheima.bufferedstream_demo;

import java.io.*;

/*
    1 字符缓冲流：
        BufferedWriter：可以将数据高效的写出
        BufferedReader：可以将数据高效的读入到内存

    2 字符缓冲流特有功能
        BufferedWriter类
            void newLine()：写一个行分隔符，会根据操作系统的不同,写入不同的行分隔符

        BufferedReader类
            public String readLine() ：读取文件一行数据, 不包含换行符号 ,  读到文件的末尾返回null

        远桥之下泛莲舟
        岱岩石上松溪流
        万仞翠山梨亭在
        莫闻空谷声悠悠
 */
public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 1 字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("day11_demo\\a.txt"));

        String line;// 记录的是每次读到的一行数据
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();

//        // public String readLine() ：读取文件一行数据, 不包含换行符号 ,  读到文件的末尾返回null
//        String s = br.readLine();
//        System.out.println(s);
//        s = br.readLine();
//        System.out.println(s);
//        s = br.readLine();
//        System.out.println(s);
//        s = br.readLine();
//        System.out.println(s);
//
//        s = br.readLine();
//        System.out.println(s);
//        s = br.readLine();
//        System.out.println(s);
    }

    private static void method() throws IOException {
        // 1 创建的是字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11_demo\\a.txt"));
        // 2 写数据
        bw.write("远桥之下泛莲舟");
        bw.newLine();
        bw.write("岱岩石上松溪流");
        bw.newLine();
        bw.write("万仞翠山梨亭在");
        bw.newLine();
        bw.write("莫闻空谷声悠悠");
        bw.newLine();

        // 释放资源
        bw.close();
    }
}