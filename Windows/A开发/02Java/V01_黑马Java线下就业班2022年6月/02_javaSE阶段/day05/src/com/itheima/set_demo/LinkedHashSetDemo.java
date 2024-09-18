package com.itheima.set_demo;

import java.util.LinkedHashSet;

/*
    LinkedHashSet : 底层数据结构 : 链表 + 哈希表
    链表   : 保证元素的有序
    哈希表 : 保证元素的唯一
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(33);
        linkedHashSet.add(22);
        linkedHashSet.add(11);
        linkedHashSet.add(11);
        linkedHashSet.add(11);
        linkedHashSet.add(55);
        linkedHashSet.add(44);
        System.out.println(linkedHashSet);
    }
}
