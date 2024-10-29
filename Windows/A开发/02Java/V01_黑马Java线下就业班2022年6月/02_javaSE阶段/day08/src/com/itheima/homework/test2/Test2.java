package com.itheima.homework.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    请定义一个可以存储“整数”的集合，并存储一些数据。

    请按以下要求顺序编程实现：
        1 对集合中的数据打乱顺序；
        2 打印集合
        3 对集合中的数据进行升序排序
        4 打印集合
        5 对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现)
        6 打印集合


 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //  1 对集合中的数据打乱顺序
        Collections.shuffle(list);
        System.out.println(list);

        // 2 对集合中的数据进行升序排序
        Collections.sort(list);
        System.out.println(list);

        // 3 对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现)
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list);
    }
}
