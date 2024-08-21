package com.itheima.innerclass.demo4;

import java.util.Arrays; //导入工具类所在包
import java.util.Comparator;


public class ArraysTest {
    public static void main(String[] args) {
        //数组
        Integer[] array = {3, 1, 5, 2, 8, 4};//Integer就是int类型

        System.out.println("排序前：" + Arrays.toString(array));

        //对数组进行排序
        //使用JDK提供的现成工具类：Arrays，实现排序
        //Arrays.sort(array);//默认排序规则： 升序（从小到大）

        //程序需求：数组元素必须是从大到小（降序）
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });


        System.out.println("排序后：" + Arrays.toString(array));
    }
}
