package com.atguigu.e_random;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random rd = new Random();
        int data1 = rd.nextInt(10);
        System.out.println("data1 = " + data1);
        System.out.println("=================");
        //在1-10之间随机一个数: nextInt(10)+1 -> (0-9)+1 -> 1-10
        int data2 = rd.nextInt(10)+ 1;
        System.out.println("data2 = " + data2);
        System.out.println("=================");
        //在1-100之间随机一个数: nextInt(100)+1 -> (0-99)+1 -> 1-100
        int data3 = rd.nextInt(100) + 1;
        System.out.println("data3 = " + data3);
        System.out.println("=================");
        //在100-999之间随机一个数: nextInt(900)+100 -> (0-899)+100 -> 100-999
        int data4 = rd.nextInt(900) + 100;
        System.out.println("data4 = " + data4);

    }
}
