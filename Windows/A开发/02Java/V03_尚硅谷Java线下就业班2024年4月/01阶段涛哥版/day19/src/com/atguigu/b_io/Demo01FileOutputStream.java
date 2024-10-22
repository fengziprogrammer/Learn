package com.atguigu.b_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Demo01FileOutputStream {
    public static void main(String[] args) throws Exception {
        //void write(int b) -> 一次写一个字节
        //method01();
        // void write(byte[] b) -> 一次写一个字节数组
        //method02();
        // void write(byte[] b, int off, int len) -> 一次写一个字节数组一部分
        //method03();

        method04();
    }

    private static void method04()throws Exception {
        FileOutputStream fos = new FileOutputStream("day19_IO\\io\\1.txt");
        //byte[] bytes = "你好".getBytes();//[-28, -67, -96, -27, -91, -67]
        //fos.write("你好".getBytes());
        fos.close();
    }

    /**
     *   void write(byte[] b, int off, int len) -> 一次写一个字节数组一部分
     *              b:被操作的数组
     *              off:从数组的哪个索引开始写
     *              len:写多少个
     */
    private static void method03()throws Exception {
        FileOutputStream fos = new FileOutputStream("day19_IO\\io\\1.txt");
        byte[] bytes = {97,98,99,100,101,102};
        fos.write(bytes,0,2);
        fos.close();
    }

    /**
     * void write(byte[] b) -> 一次写一个字节数组
     */
    private static void method02()throws Exception {
        FileOutputStream fos = new FileOutputStream("day19_IO\\io\\1.txt");
        byte[] bytes = {97,98,99,100,101};
        fos.write(bytes);
        fos.close();
    }

    /**
     * void write(int b) -> 一次写一个字节
     * @throws FileNotFoundException
     */
    private static void method01() throws Exception {
        FileOutputStream fos = new FileOutputStream("day19_IO\\io\\1.txt");
        fos.write(97);
        //关流
        fos.close();
    }
}
