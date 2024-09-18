package com.itheima.list_demo;

import java.util.ArrayList;
import java.util.List;

/*
    List继承了Collection中所有方法，元素具备索引特性，因此新增了一些含有索引的特有方法，如下：

    - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
    - public E get(int index):返回集合中指定位置的元素。
    - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
    - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素


        IndexOutOfBoundsException : 集合索引越界
        ArrayIndexOutOfBoundsException : 数组的索引越界
        StringIndexOutOfBoundsException : 字符串索引越界
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("典韦");
        list.add("吕布");
        list.add("庞德");
        list.add("徐晃");

        // public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        // list.add(2 , "邓艾");

        // public E get(int index):返回集合中指定位置的元素。
        // System.out.println(list.get(3));

        // public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        // System.out.println(list.remove(2));

        // public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素
        System.out.println(list.set(1 , "马超"));

        System.out.println(list);
    }
}
