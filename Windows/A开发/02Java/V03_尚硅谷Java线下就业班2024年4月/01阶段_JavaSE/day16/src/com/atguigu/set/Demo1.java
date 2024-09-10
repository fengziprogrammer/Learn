package com.atguigu.set;

import java.util.HashSet;

public class Demo1 {

    /*
        Set
            存取无序,无索引,不可以存储重复元素
            没有特殊方法

            保证元素的唯一性
     */
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("aa");
        set.add("aa");
        set.add("bb");
        set.add("ccc");
        set.add("333");
        set.add("11");
        set.add("abc");
        set.add("yy");
        set.add("ww");
        set.add("xx");
        set.add("xx");
        set.add("zz");
        System.out.println(set);
    }
}
