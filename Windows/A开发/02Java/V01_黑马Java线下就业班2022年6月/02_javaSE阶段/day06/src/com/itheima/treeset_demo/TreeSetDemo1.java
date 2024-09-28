package com.itheima.treeset_demo;

import java.util.Comparator;
import java.util.TreeSet;

/*
    需求1 : 定义一个TreeSet集合 , 存储Integer类型的数据, 并遍历

    比较器排序和自然排序都存在 , 优先于使用比较器
 */
public class TreeSetDemo1 {
    public static void main(String[] args) {
        // TreeSet<Integer> ts = new TreeSet<>(Comparator的实现类对象);
        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        ts.add(10);
        ts.add(30);
        ts.add(30);
        ts.add(20);
        ts.add(20);
        ts.add(10);
        ts.add(30);
        System.out.println(ts);
    }
}
