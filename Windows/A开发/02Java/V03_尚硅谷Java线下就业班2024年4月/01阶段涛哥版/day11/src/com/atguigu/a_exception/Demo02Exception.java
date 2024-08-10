package com.atguigu.a_exception;

public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr = new int[3];
        method(arr);
        System.out.println("哈哈哈哈");
    }

    private static void method(int[] arr) {
        System.out.println(arr[3]);
    }
}
