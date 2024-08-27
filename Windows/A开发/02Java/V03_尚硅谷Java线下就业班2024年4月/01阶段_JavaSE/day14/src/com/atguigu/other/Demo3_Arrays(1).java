package com.atguigu.other;

import java.util.Arrays;

public class Demo3_Arrays {

    /*
    public static String toString(int[] a)
    public static void sort(int[] a)
    public static int binarySearch(int[] a,int key)
        (-(插入点) - 1)。
     */
    public static void main(String[] args) {

        int[] arr = {1,3,9,2,44,6};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// [1, 2, 3, 6, 9, 44]
        System.out.println(Arrays.binarySearch(arr,88));//8:-5  4:-4  18:-6

    }
}
