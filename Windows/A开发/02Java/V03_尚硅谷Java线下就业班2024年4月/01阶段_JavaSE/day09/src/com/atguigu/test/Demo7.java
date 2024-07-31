package com.atguigu.test;

// import java.util.Arrays;// 导包(包中的类)
import static java.util.Arrays.sort;// 静态导入(包中类的静态方法)

import java.util.Arrays;

public class Demo7 {

    /*
        静态导入  不推荐
         导包
     */
    public static void main(String[] args) {

        int [] arr = {5,2,3};
        for (int i = 0;i<= arr.length -1;i++){
            System.out.println(arr[i]);
        }

        System.out.println("-------------------");
        Arrays.sort(arr);// 排序 正序
        // sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr){
        System.out.println("******");
    }
}
