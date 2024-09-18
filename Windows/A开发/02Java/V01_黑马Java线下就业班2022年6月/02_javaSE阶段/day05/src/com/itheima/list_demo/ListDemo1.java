package com.itheima.list_demo;

import java.util.ArrayList;
import java.util.List;

/*
    Collection接口 :
        - List
        - Set

    List接口特点
        1 有序 (存和取顺序一致)
        2 有索引 (List集合有关于索引的增删改查方法)
        3 元素可以重复
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("典韦");
        list.add("吕布");
        list.add("庞德");
        list.add("徐晃");
        list.add("徐晃");
        list.add("徐晃");

        System.out.println(list);// [典韦, 吕布, 庞德, 徐晃]


    }
}
