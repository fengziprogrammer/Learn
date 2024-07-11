package com.atguigu.a_array;

import java.util.Arrays;

public class Demo03Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //如果i的值变化到了最大索引,证明输出的即将是最后一个元素
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
