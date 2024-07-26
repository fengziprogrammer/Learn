package com.atguigu.a_array;

import java.util.Arrays;

public class Demo01MaoPao {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        /*
           第一圈
         */
        //for (int i = 0; i < arr.length-1-0; i++) {
        //    if (arr[i] > arr[i + 1]) {
        //        int temp = arr[i];
        //        arr[i] = arr[i + 1];
        //        arr[i + 1] = temp;
        //    }
        //}
        //System.out.println(Arrays.toString(arr));//按照[索引1,索引2]的格式打印元素

        /*
          第二圈
         */
        //for (int i = 0; i < arr.length-1-1; i++) {
        //    if (arr[i] > arr[i + 1]) {
        //        int temp = arr[i];
        //        arr[i] = arr[i + 1];
        //        arr[i + 1] = temp;
        //    }
        //}
        //System.out.println(Arrays.toString(arr));//按照[索引1,索引2]的格式打印元素

        /*
          第三圈
         */
        //for (int i = 0; i < arr.length-1-2; i++) {
        //    if (arr[i] > arr[i + 1]) {
        //        int temp = arr[i];
        //        arr[i] = arr[i + 1];
        //        arr[i + 1] = temp;
        //    }
        //}
        //System.out.println(Arrays.toString(arr));//按照[索引1,索引2]的格式打印元素

        /*
          第四圈
         */
        //for (int i = 0; i < arr.length-1-3; i++) {
        //    if (arr[i] > arr[i + 1]) {
        //        int temp = arr[i];
        //        arr[i] = arr[i + 1];
        //        arr[i + 1] = temp;
        //    }
        //}
        //System.out.println(Arrays.toString(arr));//按照[索引1,索引2]的格式打印元素

        //System.out.println("=====================");
        //外层循环代表圈数
        for (int j = 0; j < arr.length-1; j++) {
            //内层循环代表比较以及比较的次数
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));//按照[索引1,索引2]的格式打印元素
    }
}
