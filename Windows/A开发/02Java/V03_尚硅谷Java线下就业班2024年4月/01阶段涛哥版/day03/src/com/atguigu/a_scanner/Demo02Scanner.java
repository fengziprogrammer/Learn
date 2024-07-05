package com.atguigu.a_scanner;

import java.util.Scanner;

public class Demo02Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入第一个整数:");
        int data1 = sc.nextInt();
        System.out.println("请你输入第二个整数:");
        int data2 = sc.nextInt();
        System.out.println("请你输入第三个整数:");
        int data3 = sc.nextInt();

        int temp = (data1 > data2) ? data1 : data2;
        int max = (temp > data3) ? temp : data3;
        System.out.println("max = " + max);
    }
}
