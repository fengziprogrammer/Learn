package com.itheima.homework.test3;

import java.util.ArrayList;
import java.util.Iterator;

/*
    需求：创建一个ArrayList集合，添加5个整数，然后使用不同的方式遍历这些数据。
        1. 自增for循环遍历
        2. 迭代器遍历
        3. 增强for循环遍历
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            System.out.println(integer);
        }

        System.out.println("===============");


        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println("===============");

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer integer = it.next();
            System.out.println(integer);
        }
    }
}
