package com.atguigu.a_outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01FileOutputStream {
    public static void main(String[] args) throws Exception {
        //method01();
        //method02();
        //method03();
        //method04();
        method05();
    }


    private static void method05() throws Exception{
        FileOutputStream fos = new FileOutputStream("day20_IO\\1.txt",true);
        fos.write("日照香炉生紫烟".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("遥看瀑布挂前川".getBytes());
        fos.write("\n".getBytes());
        fos.write("飞流直下三千尺".getBytes());
        fos.write("\n".getBytes());
        fos.write("疑是银河落九天\n".getBytes());
        fos.close();
    }

    /**
     * 在不自己翻码表的情况下,想存啥就存啥
     */
    private static void method04()throws Exception {
        FileOutputStream fos = new FileOutputStream("day20_IO\\1.txt");
        //byte[] bytes = "你好".getBytes();
        fos.write("你好".getBytes());
        fos.close();
    }

    /**
     *   void write(byte[] b, int off, int len) -> 一次写一个字节数组一部分
     *                     b:数组
     *                     off:从数组的哪个索引开始写
     *                     len:写多少个
     */
    private static void method03()throws Exception {
        FileOutputStream fos = new FileOutputStream("day20_IO\\1.txt");
        byte[] bytes = {97,98,99,100,101,102};
        fos.write(bytes,0,2);
        fos.close();
    }

    /**
     * void write(byte[] b) -> 一次写一个字节数组
     */
    private static void method02() throws Exception {
        FileOutputStream fos = new FileOutputStream("day20_IO\\1.txt");
        byte[] bytes = {97,98,99,100};
        fos.write(bytes);
        fos.close();
    }

    /**
     * void write(int b) -> 一次写一个字节
     *
     * @throws IOException
     */
    public static void method01() throws IOException {
        FileOutputStream fos = new FileOutputStream("day20_IO\\1.txt");
        //void write(int b) -> 一次写一个字节
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }

}
