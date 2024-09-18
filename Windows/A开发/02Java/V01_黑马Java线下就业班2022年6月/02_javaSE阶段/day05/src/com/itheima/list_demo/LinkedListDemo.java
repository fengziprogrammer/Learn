package com.itheima.list_demo;

import java.util.LinkedList;

/*
    LinkedList特有功能
         public void addFirst(E e):将指定元素插入此列表的开头。
         public void addLast(E e):将指定元素添加到此列表的结尾。
         public E getFirst():返回此列表的第一个元素。
         public E getLast():返回此列表的最后一个元素。
         public E removeFirst():移除并返回此列表的第一个元素。
         public E removeLast():移除并返回此列表的最后一个元素。
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        // 创建集合对象
        LinkedList<String> list = new LinkedList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        list.add("欧阳娜娜");

        // public void addFirst(E e):将指定元素插入此列表的开头。
        // list.addFirst("李沁");

        // public E removeLast():移除并返回此列表的最后一个元素。
        // list.removeLast();


        System.out.println(list.get(3));

        // System.out.println(list);// [迪丽热巴, 古力娜扎, 马尔扎哈, 欧阳娜娜]
    }
}
