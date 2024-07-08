package com.atguigu.e_random;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random rd = new Random();
        int data1 = rd.nextInt();
        System.out.println("data1 = " + data1);
        System.out.println("===================");
        double data2 = rd.nextDouble();
        System.out.println("data2 = " + data2);
    }
}
