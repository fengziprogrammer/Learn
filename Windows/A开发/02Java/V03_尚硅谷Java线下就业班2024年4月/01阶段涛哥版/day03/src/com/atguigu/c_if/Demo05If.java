package com.atguigu.c_if;

import java.util.Scanner;

public class Demo05If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入第一个整数:");
        int data1 = sc.nextInt();
        System.out.println("请你输入第二个整数:");
        int data2 = sc.nextInt();
        System.out.println("请你输入第三个整数:");
        int data3 = sc.nextInt();

        int temp = 0;
        if (data1>data2){
            temp = data1;
        }else{
            temp = data2;
        }

        if (temp>data3){
            System.out.println(temp);
        }else{
            System.out.println(data3);
        }
    }
}
