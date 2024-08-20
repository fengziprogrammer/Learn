package com.atguigu.i_arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] arr1 = {5,4,3,2,1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("=====================");

        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(arr2, 1);
        System.out.println("index = " + index);

        System.out.println("=====================");

        /*
          static int[] copyOf(int[] original, int newLength)
         */
        int[] arr3 = {1,2,3,4,5};
        int[] newArray = Arrays.copyOf(arr3, 10);
        arr3 = newArray;
        System.out.println(Arrays.toString(arr3));
    }
}
