package com.atguigu.string;

public class Demo1 {

    /*
        - String的替换功能及案例演示
        String replace(char old,char new) 将该字符串的old字符用new字符替换
        String replace(String old,String new)

        - String的去除字符串两边空字符及案例演示
        String trim()      //去除字符串前后的空字符 "  aaa "
        abc
        abc

        阅读源码的作用
            1> 理解该功能
            2> 学习源码 思路 ,编程技巧

            ￥3845734jkgf￥

     */
    public static void main(String[] args) {

       /* String s = "dhfiuerh";
        System.out.println(s.replace('h','a'));
        System.out.println(s.replace("dh","aa"));
        System.out.println(s.replace("deh","ccc"));*/

        String s = "  fgeoigj   ";
        System.out.println("***"+s.trim() + "***");

    }
}
