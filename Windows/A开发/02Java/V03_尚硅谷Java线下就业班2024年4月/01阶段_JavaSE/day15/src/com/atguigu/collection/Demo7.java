package com.atguigu.collection;

import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo7 {

    /*

    3>遍历Collection的三种方式
        1> 迭代器
        2> 增强for 循环
        3> -> arr -> 遍历数组
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(111);
        list.add(222);
        list.add(222);
        list.add(3333);
        System.out.println(list);

        // 1> 迭代器
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------");

        // 2> 增强for 循环
        for(Integer i:list){
            System.out.println(i);
        }
        System.out.println("------------------");

        // 3> -> arr -> 遍历数组
        Object[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }


    }
}
