package com.itheima.stream_demo;

import java.util.ArrayList;
import java.util.List;

/*
    Stream流的收集操作 : 第一部分

    需求：过滤元素并遍历集合
        定义一个集合，并添加一些整数 1,2,3,4,5,6,7,8,9,10
        将集合中的奇数删除，只保留偶数。
        遍历集合得到 2，4，6，8，10

    结论：在Stream流中无法直接修改集合,数组等数据源中的数据。
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list.stream().filter((Integer i) -> {
            return i % 2 == 0;
        }).forEach((Integer i) -> {
            System.out.println(i);
        });


        System.out.println(list);// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
