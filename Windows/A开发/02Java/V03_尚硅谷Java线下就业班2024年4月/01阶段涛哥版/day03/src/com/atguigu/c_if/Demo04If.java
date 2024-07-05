package com.atguigu.c_if;

import java.util.Scanner;

public class Demo04If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入第一个整数:");
        int data1 = sc.nextInt();
        System.out.println("请你输入第二个整数:");
        int data2 = sc.nextInt();

        if (data1>data2){
            System.out.println(data1);
        }else {
            System.out.println(data2);
        }
    }
}
