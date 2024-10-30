package com.atguigu.c_filereader;

import java.io.FileReader;

public class Demo01FileReader {
    public static void main(String[] args) throws Exception {
        //method01();
        method02();
    }

    /**
     * int read(char[] cbuf) -> 一次读取一个字符数组,返回读取个数
     */
    private static void method02()throws Exception {
        FileReader fr = new FileReader("day20_IO\\3.txt");
        char[] chars = new char[1024];
        int len = 0;
        while((len = fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }

    /**
     *  int read()  -> 一次读取一个字符,返回int值
     */
    private static void method01() throws Exception{
        FileReader fr = new FileReader("day20_IO\\3.txt");
        /*int data1 = fr.read();
        System.out.println(data1);

        int data2 = fr.read();
        System.out.println(data2);

        int data3 = fr.read();
        System.out.println(data3);*/

        int len;
        while((len = fr.read())!=-1){
            System.out.println((char) len);
        }
        fr.close();
    }
}
