package com.itheima.changeparameter_demo;

public class Test {
    public static void main(String[] args) {
        int[] arr = {33,22,11};
        getSum(arr);
        getSum(11 , 22 , 33);
    }

//    public static int getSum(int[] num) {
//        int sum = 0;
//        for (int i : num) {
//            sum += i;
//        }
//        return sum;
//    }

    public static int getSum(int... num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }

//    public static int getSum(int a, int b) {
//        return a + b;
//    }
//
//    public static int getSum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int getSum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }
}
