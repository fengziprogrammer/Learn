package com.atguigu.f_array;

public class Demo07Array {
    public static void main(String[] args) {
        int[] arr1 = new int[3];

        System.out.println(arr1[0]);//默认值0
        System.out.println(arr1[1]);//默认值0
        System.out.println(arr1[2]);//默认值0

        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;

        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
