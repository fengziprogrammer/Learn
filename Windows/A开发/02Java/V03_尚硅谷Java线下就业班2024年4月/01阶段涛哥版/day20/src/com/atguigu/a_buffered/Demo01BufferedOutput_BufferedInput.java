package com.atguigu.a_buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo01BufferedOutput_BufferedInput {
    public static void main(String[] args)throws Exception {
        //copy1();
        copy2();
    }

    /**
     * 用缓冲流复制
     * @throws Exception
     */
    private static void copy2()throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\Idea\\io\\upload\\1.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\Idea\\io\\upload\\2.avi"));
        long start = System.currentTimeMillis();

        //定义一个数组
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        long end = System.currentTimeMillis();

        System.out.println((end-start)+"毫秒");

        //关流-> 先开的后关
        bos.close();
        bis.close();
    }

    /**
     * 用普通流复制一个视频
     */
    private static void copy1()throws Exception {
        FileInputStream fis = new FileInputStream("E:\\Idea\\io\\upload\\1.avi");
        FileOutputStream fos = new FileOutputStream("E:\\Idea\\io\\upload\\2.avi");

        long start = System.currentTimeMillis();

        //定义一个数组
        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        long end = System.currentTimeMillis();

        System.out.println((end-start)+"毫秒");

        //关流-> 先开的后关
        fos.close();
        fis.close();
    }
}
