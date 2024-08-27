package com.atguigu.other;

import java.util.Scanner;

public class Demo2_Scanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// 创建键盘录入对象

        System.out.println("请输入一个整数");
       /* int i = sc.nextInt(); //键盘录入整数存储在i中
        System.out.println(i);*/


        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.println("您输入的有效整数为:" + i);
        } else {
            System.out.println("你输入的类型错误!");
        }

    }
}
