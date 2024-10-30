package com.atguigu.e_buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo01BufferedInAndOut {
    public static void main(String[] args) throws Exception{
        //method01();//用普通流复制  822
        method02();//用字节缓冲流复制
    }

    private static void method02()throws Exception {
        //1.创建FileInputStream用来读取图片字节
        FileInputStream fis = new FileInputStream("E:\\Idea\\io\\1.mp4");
        //2.创建FileOutputStream用来将读取的图片字节写到指定位置
        FileOutputStream fos = new FileOutputStream("E:\\Idea\\io\\copy.mp4");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        long start = System.currentTimeMillis();


        //3.一次读取一个字节数组 -> 长度习惯上都是定1024或者其倍数
        byte[] bytes = new byte[1024];

        //4.边读边写
        int len = 0;
        while((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);

        //5.关流 -> 习惯上先开的后关
        bos.close();
        bis.close();
    }

    private static void method01()throws Exception {
        //1.创建FileInputStream用来读取图片字节
        FileInputStream fis = new FileInputStream("E:\\Idea\\io\\1.mp4");
        //2.创建FileOutputStream用来将读取的图片字节写到指定位置
        FileOutputStream fos = new FileOutputStream("E:\\Idea\\io\\copy.mp4");

        long start = System.currentTimeMillis();


        //3.一次读取一个字节数组 -> 长度习惯上都是定1024或者其倍数
        byte[] bytes = new byte[1024];

        //4.边读边写
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);

        //5.关流 -> 习惯上先开的后关
        fos.close();
        fis.close();
    }
}
