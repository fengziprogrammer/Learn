package com.atguigu.a_scanner;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个整数:");
        int data1 = sc.nextInt();
        System.out.println("data1 = " + data1);
        System.out.println("请您输入一个字符串:");
        String data2 = sc.next();
        System.out.println("data2 = " + data2);
    }
}
