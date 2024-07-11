package com.atguigu.a_array;

import java.util.Scanner;

public class Demo02Array {
    public static void main(String[] args) {
        String[] arr = new String[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请你输入第"+(i+1)+"个学员姓名:");
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
