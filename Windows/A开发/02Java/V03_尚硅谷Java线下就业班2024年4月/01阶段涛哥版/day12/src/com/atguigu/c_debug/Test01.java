package com.atguigu.c_debug;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        for (int i = 0; i < 5; i++) {
            method(arr);//假装实现了百度一下功能
        }
    }

    public static void method(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
