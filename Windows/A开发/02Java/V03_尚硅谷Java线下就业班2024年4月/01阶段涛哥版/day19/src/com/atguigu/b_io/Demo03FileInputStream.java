package com.atguigu.b_io;

import java.io.FileInputStream;

public class Demo03FileInputStream {
    public static void main(String[] args) throws Exception {
        //method01();
        System.out.println("================");
        //method02();
        System.out.println("================");
        method03();
    }

    /**
     *  int read(byte[] b) -> 一次读取一个字节数组,返回的是读取的个数
     *
     *  注意:
     *    a.字节数组定多长,每次就会读取多少个字节,数组相当于是一个临时存储空间,
     *      读到的内容会自动保存到数组中
     *    b.一般情况下,数组长度都是指定1024或者1024的倍数
     */
    private static void method03()throws Exception {
        FileInputStream fis = new FileInputStream("day19_IO\\io\\1.txt");
        byte[] bytes = new byte[5];
        /*int len1 = fis.read(bytes);
        //System.out.println(len1);//2
        System.out.println(new String(bytes,0,len1));

        int len2 = fis.read(bytes);
        //System.out.println(len2);//2
        System.out.println(new String(bytes,0,len2));

        int len3 = fis.read(bytes);
        //System.out.println(len3);//1
        System.out.println(new String(bytes,0,len3));

        int len4 = fis.read(bytes);
        System.out.println(len4);// 读到结束标记之后返回-1*/

        //定义一个变量,接收读取的字节个数
        int len;
        while((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();

    }

    private static void method02() throws Exception {
        FileInputStream fis = new FileInputStream("day19_IO\\io\\1.txt");
        //定义一个变量,接收读取的字节
        int len;
        while ((len = fis.read()) != -1) {
            //System.out.println(len);
            System.out.println((char) len);
        }
        fis.close();
    }

    /**
     * int read() -> 一次读取一个字节,返回的是字符对应的字节整数
     */
    private static void method01() throws Exception {
        FileInputStream fis = new FileInputStream("day19_IO\\io\\1.txt");
        int data1 = fis.read();
        System.out.println(data1);//a

        int data2 = fis.read();
        System.out.println(data2);//b

        int data3 = fis.read();
        System.out.println(data3);//c 假如到c就读完了

        int data4 = fis.read();//-1
        System.out.println((char)data4);

        int data5 = fis.read();//-1
        System.out.println((char)data5);

        fis.close();
    }
}
