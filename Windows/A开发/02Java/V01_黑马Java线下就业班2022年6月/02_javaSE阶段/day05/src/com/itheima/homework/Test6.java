package com.itheima.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
    定义一个Collection类型的集合，存储以下分数信息：


        88.5,39.2,77.1,56.8,89,99,59.5


    请编程实现以下功能：

    - 使用增强for遍历所有元素，并打印
    - 使用增强for遍历所有元素，打印不及格的分数；
    - 使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
    - 使用增强for遍历所有元素，求出最高分，并打印；


    (注意：以上所有功能写在一个main()方法中，但请单独实现)
 */
public class Test6 {
    public static void main(String[] args) {

        // 创建集合对象
        List<Double> c = new ArrayList<>();

        // 添加元素
        Collections.addAll(c, 88.5, 39.2, 77.1, 56.8, 89D, 99D, 59.5);

        // System.out.println(c); // [88.5, 39.2, 77.1, 56.8, 89, 99, 59.5]

        // 使用增强for遍历所有元素，并打印
        for (Double o : c) {
            System.out.println(o);
        }

        System.out.println("==============");

        //  - 使用增强for遍历所有元素，打印不及格的分数；
        //  - 使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
        double sum = 0; // 总分
        int count = 0;// 统计不及格数量
        for (Object o : c) {
            double d = (double) o;
            if (d < 60) {
                System.out.println(d);// 打印不及格分数
                count++; // 统计不及格数量
            }

            sum += d;// 总分
        }
        System.out.println("平局分:" + sum / c.size());

        System.out.println("==============");

        // 使用增强for遍历所有元素，求出最高分，并打印
        double max = c.get(0);// 拿到集合中第一个元素 , 作为参照物
        for (double d : c) {
            if(d > max){
                max = d;
            }
        }
        System.out.println(max);
    }
}
