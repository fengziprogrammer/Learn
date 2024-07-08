package com.atguigu.f_array;

import java.util.Random;

public class Demo05Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10);
        }
    }
}
