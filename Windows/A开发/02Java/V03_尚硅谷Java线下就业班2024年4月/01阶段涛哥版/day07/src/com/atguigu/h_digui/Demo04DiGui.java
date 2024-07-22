package com.atguigu.h_digui;

public class Demo04DiGui {
    public static void main(String[] args) {
        int result = method(12);
        System.out.println("result = " + result);
    }

    public static int method(int n) {
        if (n==1 || n==2){
            return 1;
        }
        return method(n-2)+method(n-1);
    }
}
