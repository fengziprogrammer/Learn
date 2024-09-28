package com.itheima.homework.work2;

import java.util.LinkedHashSet;

/*
    LinkedHashSet -->  特点 : 元素有序 , 唯一
 */
public class Test2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(40);
        linkedHashSet.add(40);
        linkedHashSet.add(20);
        linkedHashSet.add(10);
        linkedHashSet.add(30);
        linkedHashSet.add(30);

        System.out.println(linkedHashSet);
    }
}
