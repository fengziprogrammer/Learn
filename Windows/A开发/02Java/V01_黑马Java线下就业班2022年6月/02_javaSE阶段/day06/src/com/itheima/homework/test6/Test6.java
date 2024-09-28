package com.itheima.homework.test6;

import java.util.HashSet;
import java.util.Iterator;

/*
    请编写main()方法，按以下要求顺序：

    1. 定义一个Set集合，并存储以下数据：刘备,关羽,张飞,刘备,张飞
    2. 打印集合大小
    3. 使用迭代器遍历集合，并打印每个元素
    4. 使用增强for遍历集合，并打印每个元素
 */
public class Test6 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("刘备");
        hs.add("关羽");
        hs.add("张飞");
        hs.add("刘备");
        hs.add("张飞");

//        2. 打印集合大小
        System.out.println(hs.size());

        System.out.println("============");

//        3. 使用迭代器遍历集合，并打印每个元素
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("============");

//        4. 使用增强for遍历集合，并打印每个元素
        for (String h : hs) {
            System.out.println(h);
        }
    }
}
