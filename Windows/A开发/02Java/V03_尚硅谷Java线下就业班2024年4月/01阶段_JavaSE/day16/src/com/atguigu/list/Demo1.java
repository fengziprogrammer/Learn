package com.atguigu.list;

import java.util.ArrayList;

public class Demo1 {

    /*
    List
        存取有序 有索引,可以存储重复的元素
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ddd");
        list.add("ccc");
        System.out.println(list);
        System.out.println(list.get(2));

    }
}
