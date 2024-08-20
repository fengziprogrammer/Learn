package com.atguigu.a_stringbuilder;

import java.util.Scanner;

public class Demo03StringBuilder {
    public static void main(String[] args) {
        //1.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个字符串:");
        String data = sc.next();
        //2.创建StringBuilder对象,将输入的字符串放进去
        StringBuilder sb = new StringBuilder(data);
        //3.翻转内容
        sb.reverse();
        //4.将StringBuilder对象转成String对象
        String s = sb.toString();
        if (s.equals(data)){
            System.out.println("是回文内容");
        }else{
            System.out.println("不是回文内容");
        }
    }
}
