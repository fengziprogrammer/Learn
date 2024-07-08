package com.atguigu.f_array;

public class Demo12Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);//地址值
        System.out.println(arr[0]);//0
        System.out.println(arr[1]);//0
        System.out.println(arr[2]);//0
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(arr[0]);//100
        System.out.println(arr[1]);//200
        System.out.println(arr[2]);//300
    }
}
