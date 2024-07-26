package com.atguigu.a_array;

import java.util.Arrays;

public class Demo02XuanZe {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
       /* for (int i = 0; i < arr.length-1; i++) {
            if (arr[0]>arr[i+1]){
                int temp = arr[0];
                arr[0] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length-1; i++) {
            if (arr[1]>arr[i+1]){
                int temp = arr[1];
                arr[1] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 2; i < arr.length-1; i++) {
            if (arr[2]>arr[i+1]){
                int temp = arr[2];
                arr[2] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 3; i < arr.length-1; i++) {
            if (arr[3]>arr[i+1]){
                int temp = arr[3];
                arr[3] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));*/

        System.out.println("=====================");

        for (int j = 0; j < arr.length; j++) {
            for (int i = j; i < arr.length-1; i++) {
                if (arr[j]>arr[i+1]){
                    int temp = arr[j];
                    arr[j] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
