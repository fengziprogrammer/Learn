package com.itheima.set_demo;

import java.util.HashSet;
import java.util.Iterator;

/*
    练习 : 使用HashSet集合存储字符串并遍历

    HashSet特点 :
        1 无序
        2 没有索引
        3 保证元素唯一 !!!
 */
public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        // 添加元素
        hs.add("许褚");
        hs.add("夏侯惇");
        hs.add("夏侯渊");
        hs.add("夏侯渊");
        hs.add("夏侯渊");
        hs.add("夏侯渊");
        hs.add("张辽");
        hs.add("张辽");
        hs.add("张辽");
        hs.add("于禁");
        hs.add("于禁");
        hs.add("于禁");
        hs.add("典韦");

        // 遍历方式1 : 迭代器
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("=================");

        // 遍历方式2 : 增强for循环
        for (String s : hs) {
            System.out.println(s);
        }
    }
}
