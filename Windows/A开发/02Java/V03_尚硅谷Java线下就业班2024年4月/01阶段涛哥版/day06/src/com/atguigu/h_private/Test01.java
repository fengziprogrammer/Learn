package com.atguigu.h_private;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //System.out.println(Arrays.toString(arr));
        toString(arr);

    }

    public static void toString(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+", ");
            }
        }
    }
}
