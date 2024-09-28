package com.itheima.treeset_demo;

import java.util.TreeSet;

/*
    需求2 : 使用TreeSet集合存储自定义对象 , 并遍历
    特点:
        1 元素唯一
        2 排序
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("zhangsan" , 23);
        Student s2 = new Student("lisi" , 25);
        Student s3 = new Student("wangwu" , 24);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        System.out.println(ts);

    }
}
