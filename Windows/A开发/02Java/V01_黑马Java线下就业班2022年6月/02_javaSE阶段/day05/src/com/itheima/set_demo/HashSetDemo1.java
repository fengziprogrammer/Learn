package com.itheima.set_demo;

import java.util.HashSet;
import java.util.Set;

/*
    Set特点 :
        1 无序    (存储顺序不一致)
        2 没有索引
        3 保证元素唯一
 */
public class HashSetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // 添加元素
        set.add("诸葛亮");
        set.add("司马懿");
        set.add("贾诩");
        set.add("郭嘉");
        set.add("荀彧");
        set.add("荀彧");
        set.add("荀彧");
        set.add("荀彧");
        set.add("荀彧");


        System.out.println(set);// [司马懿, 诸葛亮, 荀彧, 贾诩, 郭嘉]

    }
}
