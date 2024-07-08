package com.atguigu.f_array;

public class Demo08Array {
    public static void main(String[] args) {
        String[] arr = new String[3];
        System.out.println(arr[0]);//null
        System.out.println(arr[1]);//null
        System.out.println(arr[2]);//null

        arr[0] = "张三丰";
        arr[1] = "张翠山";
        arr[2] = "张无忌";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
