package com.atguigu.d_string;

public class Demo04String {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = "hello"+"world";  // helloworld
        String s5 = s1+"world"; //helloworld
        String s6 = s1+s2;//helloworld

        System.out.println(s3==s4);//true
        System.out.println(s3==s5);//false
        System.out.println(s3==s6);//false
    }
}
