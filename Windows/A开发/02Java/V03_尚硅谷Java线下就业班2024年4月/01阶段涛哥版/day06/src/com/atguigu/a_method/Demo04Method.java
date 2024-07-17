package com.atguigu.a_method;

public class Demo04Method {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        method(arr1);
    }

    public static void method(int[] arr2){//int[] arr2 = arr1
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
