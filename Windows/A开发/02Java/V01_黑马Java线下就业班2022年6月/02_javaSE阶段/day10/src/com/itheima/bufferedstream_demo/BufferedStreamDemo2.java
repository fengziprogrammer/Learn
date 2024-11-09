package com.itheima.bufferedstream_demo;

import java.io.*;

/*
    需求：把“xxx.avi”复制到模块目录下的“copy.avi” , 使用四种复制文件的方式 , 打印所花费的时间

    四种方式：
        1 基本的字节流一次读写一个字节            花费时间为:165138毫秒
        2 基本的字节流一次读写一个字节数组         花费时间为:266毫秒
        3 缓冲流一次读写一个字节                 花费时间为:1333毫秒
        4 缓冲流一次读写一个字节数组              花费时间为:77毫秒

    分析 :
        数据源 : D:\a.wmv
        目的地 : "day10_demo\copy.wmv"
 */
public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // method1();
        // method2();
        // method3();
        method4();
        long end = System.currentTimeMillis();
        System.out.println("花费时间为:" + (end - start) + "毫秒");
    }

    // 4 缓冲流一次读写一个字节数组
    private static void method4() throws IOException {
        // 创建高效的字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.wmv"));
        // 创建高效的字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10_demo\\copy.wmv"));

        // 一次读写一个字节数组
        byte[] bys = new byte[1024];
        int len;
        while((len = bis.read(bys)) != -1){
            bos.write(bys , 0 , len);
        }

        // 释放资源
        bis.close();
        bos.close();
    }

    // 3 缓冲流一次读写一个字节
    private static void method3() throws IOException {
        // 创建高效的字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.wmv"));
        // 创建高效的字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10_demo\\copy.wmv"));

        // 一次读写一个字节
        int by;
        while((by = bis.read()) != -1){
            bos.write(by);
        }

        // 释放资源
        bis.close();
        bos.close();
    }

    // 2 基本的字节流一次读写一个字节数组
    private static void method2() throws IOException {
        // 创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\a.wmv");
        // 创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("day10_demo\\copy.wmv");
        // 一次读写一个字节数组
        byte[] bys = new byte[1024];
        int len;
        while((len = fis.read(bys)) != -1){
            fos.write(bys , 0 , len);
        }
        // 释放资源
        fis.close();
        fos.close();
    }

    // 1 基本的字节流一次读写一个字节
    private static void method1() {
        try (// 创建字节输入流对象
             FileInputStream fis = new FileInputStream("D:\\a.wmv");
             // 创建字节输出流对象
             FileOutputStream fos = new FileOutputStream("day10_demo\\copy.wmv");) {

            // 一次读写一个字节
            int by;
            while ((by = fis.read()) != -1) {
                fos.write(by);
            }

//            // 释放资源
//            fis.close();
//            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}