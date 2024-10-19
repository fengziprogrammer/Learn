package com.itheima.homework.test1;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

/*
    需求：
    利用TreeSet实现以下需求：
        1. 随机生成10个不同的0~50之间的整数，要求按照从小到大进行遍历。
        2. 随机生成10个不同的50~100之间的整数，要求按照从大到小进行遍历。

    思路分析：
    TreeSet是具有排序特性的，默认按照自然排序。如果自然排序满足不了需求，可以使用自定义比较器。
    需求1 : 可以使用自然排序实现；
    需求2 : 可以使用自定义比较器实现

 */
public class Test1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Random r = new Random();
        // 1. 随机生成10个不同的0~50之间的整数，要求按照从小到大进行遍历。
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(51);// 0~50之间的整数
            ts.add(number);// 把随机数添加到集合中
        }
        System.out.println(ts);

        System.out.println("========================");

        TreeSet<Integer> ts2 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        // 2. 随机生成10个不同的50~100之间的整数，要求按照从大到小进行遍历
        // 1. 随机生成10个不同的0~50之间的整数，要求按照从小到大进行遍历。
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(51);// 0~50之间的整数
            ts2.add(number);// 把随机数添加到集合中
        }
        System.out.println(ts2);
    }
}
