package com.atguigu.d_string;

public class Demo02String {
    public static void main(String[] args) {
        //1.String(char[] value)  -> 根据char数组创建String对象
        char[] chars = {'a','b','c'};
        String s1 = new String(chars);
        System.out.println("s1 = " + s1);

        /*
          2.String(byte[] bytes)  -> 通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String对象
                                     平台(操作系统)默认字符集:GBK

                                     字节数为负数,一般代表中文-> 中文的字节都是负数

                                     GBK编码:一个中文占2个字节
                                     UTF-8编码: 一个中文占3个字节
         */
        byte[] bytes = {97,98,99};
        String s2 = new String(bytes);
        System.out.println("s2 = " + s2);

        System.out.println("===============");

        byte[] bytes1 = {-28,-67,-96};
        String s3 = new String(bytes1);
        System.out.println("s3 = " + s3);

        System.out.println("===============");

        /*
          3.String(char[] value, int offset, int count) -> 将char数组的一部分转成String对象
            value:要转的数组
            offset:从数组的哪个索引开始转
            count:转多少个
         */
        char[] chars1 = {'a','b','c','d','e','f'};
        String s4 = new String(chars1,0,3);
        System.out.println("s4 = " + s4);

        System.out.println("===============");

        /*
          4.String(byte[] bytes, int offset, int length)-> 将byte数组的一部分转成String对象
            bytes:要转的数组
            offset:从数组的哪个索引开始转
            length:转多少个
         */
        byte[] bytes2 = {97,98,99,100,101};
        String s5 = new String(bytes2,0,2);
        System.out.println("s5 = " + s5);
    }
}
