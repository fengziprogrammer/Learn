package com.atguigu.c_debug;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = getMax(arr);
        System.out.println("max = " + max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max< arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
