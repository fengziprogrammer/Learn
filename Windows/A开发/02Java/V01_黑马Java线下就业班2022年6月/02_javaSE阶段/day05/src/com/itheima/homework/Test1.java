package com.itheima.homework;

import java.math.BigDecimal;

/*
    有以下double数组：


    double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};


    请编程计算它们的总值及平均值(四舍五入保留小数点后2位)
 */
public class Test1 {
    public static void main(String[] args) {
        // 定义数组
        double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};

        // 定义变量 , 记录总和
        // double sum = 0;
        BigDecimal sum = new BigDecimal("0");

        // 遍历数组 , 求出总和
        for (double i : arr) {// i代表的是数组中每一个元素
            sum = sum.add(new BigDecimal(i + ""));
        }

        System.out.println("总和:" + sum);
        System.out.println("平均值:" + sum.divide(new BigDecimal(arr.length +""), 2 , BigDecimal.ROUND_HALF_UP))  ;
    }
}
