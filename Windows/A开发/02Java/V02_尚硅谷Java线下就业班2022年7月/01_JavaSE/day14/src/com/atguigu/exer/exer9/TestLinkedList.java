package com.atguigu.exer.exer9;


public class TestLinkedList {
    public static void main(String[] args) {
        SingleLinked list = new SingleLinked();
        list.add("hello");
        list.add("java");
        list.add("world");

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
