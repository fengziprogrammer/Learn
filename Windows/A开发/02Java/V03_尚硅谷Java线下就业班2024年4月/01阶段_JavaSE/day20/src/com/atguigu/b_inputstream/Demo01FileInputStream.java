package com.atguigu.b_inputstream;

import java.io.FileInputStream;
import java.util.Arrays;

public class Demo01FileInputStream {
    public static void main(String[] args)throws Exception {
        //method01();
        method02();
    }

    /**
     * int read(byte[] b) -> 一次读取一个字节数组,返回的是读取的字节个数
     */
    private static void method02()throws Exception {
        FileInputStream fis = new FileInputStream("day20_IO\\2.txt");
        /*
          此数组是一个临时存储数据的容器
          我们要读取的内容,先到数组中,再从数组中获取
          数组长度定为几,每一次读取的个数就是几
          但是如果最后假如剩1个字节,就读取一个字节
         */
        byte[] bytes = new byte[2];

       /* int len1 = fis.read(bytes);
        System.out.println(len1);

        int len2 = fis.read(bytes);
        System.out.println(len2);

        int len3 = fis.read(bytes);
        System.out.println(len3);

        int len4 = fis.read(bytes);
        System.out.println(len4);*/

        //定义一个变量,代表读取的个数
        int len;
        while((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();

    }

    /**
     * int read() -> 一次读一个字节,返回的是读取的字节数据
     * @throws Exception
     */
    private static void method01() throws Exception{
        FileInputStream fis = new FileInputStream("day20_IO\\2.txt");
        /*int data1 = fis.read();
        System.out.println(data1);

        int data2 = fis.read();
        System.out.println(data2);

        int data3 = fis.read();
        System.out.println(data3);

        int data4 = fis.read();
        System.out.println(data4);

        int data5 = fis.read();
        System.out.println((char) data5);*/


        System.out.println("============================");

/*        int data4 = fis.read();
        System.out.println(data4);

        int data5 = fis.read();
        System.out.println(data5);*/

        /*
        * 循环读取
        * */
        int len;
        while((len = fis.read())!=-1){
            //System.out.println(len);
            System.out.println((char) len);
        }

        fis.close();
    }
}
