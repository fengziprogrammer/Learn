package com.atguigu.array;

import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void test01(){
        MyArrayList list = new MyArrayList();
        list.add("hello");
        list.add("java");
        list.add(0,"world");
        list.add("html");
        list.add("bigdata");
        list.add("ui");
        list.add("sql");
        list.add("atguigu");

        list.remove(1);
        list.remove(3);

        for (Object o : list) {
            System.out.println(o);
        }

    }
}
