package com.atguigu.f_array;

public class Demo13Array {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        System.out.println(arr1);//地址值
        arr1[1] = 100;

        int[] arr2 = new int[3];
        System.out.println(arr2);//地址值
        arr2[1] = 1000;

        System.out.println(arr1[1]);//100
        System.out.println(arr2[1]);//1000
    }
}
