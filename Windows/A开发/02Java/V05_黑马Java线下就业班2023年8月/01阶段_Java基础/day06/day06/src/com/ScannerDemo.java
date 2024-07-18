package com;
/*
    键盘录入对象Scanner
        1. 导包
        2. 创建键盘对象
        3. 控制台提示
        4. 调用方法接收数据
 */

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建键盘对象
       Scanner sc=  new Scanner(System.in);
//        System.out.println("请输入字符串:");
//        //调用方法 -> 接收字符串
//        //String s = sc.next(); //碰到空格停止录入
//        String s = sc.nextLine(); //碰到回车停止录入
//        System.out.println(s);
//
//        System.out.println("请输入小数:");
//        double d = sc.nextDouble();
//        System.out.println(d);

        System.out.println("请输入整数:");
        int i = sc.nextInt();
        System.out.println(i);
    }
}
