package com.atguigu.b_twoarray;

public class Demo04Array {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][2];
        arr1[0][0] = 100;
        arr1[0][1] = 200;
        arr1[1][0] = 1000;
        arr1[1][1] = 2000;

        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][1]);
        System.out.println(arr1[1][0]);
        System.out.println(arr1[1][1]);
    }
}
