package com.atguigu.b_io;

import java.io.FileInputStream;
import java.io.FileReader;

public class Demo05FileReader {
    public static void main(String[] args)throws Exception {
       //method01();
       method02();
    }

    /**
     * int read(char[] cbuf) -> 一次读取一个字符数组,返回读取个数
     */
    private static void method02()throws Exception {
        FileReader fr = new FileReader("day19_IO\\io\\2.txt");
        char[] chars = new char[2];
        int len;//接收的是读取的个数
        while((len = fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }

    /**
     * int read() -> 一次读取一个字符
     */
    private static void method01()throws Exception {
        FileReader fr = new FileReader("day19_IO\\io\\2.txt");
        /*int data1 = fr.read();
        System.out.println((char) data1);

        int data2 = fr.read();
        System.out.println((char) data2);*/

        int len;
        while((len = fr.read())!=-1){
            System.out.println((char) len);
        }

        fr.close();
    }
}
