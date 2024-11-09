package com.itheima.bufferedstream_demo;

import java.io.*;

/*
    字节缓冲流：
        BufferOutputStream：缓冲输出流
        BufferedInputStream：缓冲输入流

    构造方法：
        字节缓冲输出流：BufferedOutputStream(OutputStream out)
        字节缓冲输入流：BufferedInputStream(InputStream in)

    为什么构造方法需要的是字节流，而不是具体的文件或者路径呢？
        字节缓冲流仅仅提供缓冲区，不具备读写功能 , 而真正的读写数据还得依靠基本的字节流对象进行操作

    需求 : 使用缓冲流进行复制文件
    数据源 : D:\传智播客\安装包\好看的图片\liqin2.jpg
    目的地 : day11_demo\copy.jpg
 */
public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10_demo\\copy.jpg"));
        // 缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\传智播客\\安装包\\IO资源 图片\\liqin.jpg"));

//        // 一次读写一个字节
//        int by;
//        while ((by = bis.read()) != -1) {
//            bos.write(by);
//        }

        // 一次读写一个字节数组
        byte[] bys = new byte[1024];
        int len;// 每次真实读到数据的个数
        while((len = bis.read(bys)) != -1){
            bos.write(bys , 0 , len);
        }

        // 释放资源
        bos.close();
        bis.close();
    }
}
