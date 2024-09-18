package com.itheima.list_demo;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Collection接口
        - List接口
            - ArrayList类  : 数组结构
            - LinkedList类 : 链表结构

    在ArrayList集合的空参构造方法中
         this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
         把一个长度为0的Object类型的数组地址赋值给了elementData数组

    size = 0
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("asd");


        int[] arr = {33, 22, 11};

        int[] ints = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(ints));
    }
}
