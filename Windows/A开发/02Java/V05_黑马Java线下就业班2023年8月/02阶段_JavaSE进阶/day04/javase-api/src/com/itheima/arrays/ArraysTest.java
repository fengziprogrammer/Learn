package com.itheima.arrays;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        //创建数组
        int[] array = {11,22,33,44,55};

        //基础班学习时，打印数组中的元素
//        System.out.println(array);//打印地址值
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] +"\t");
//        }

        //可以通过Arrays工具类，直接打印数组中的元素（玩法：把数组转换为字符串）
        System.out.println(Arrays.toString(array));
    }
}
