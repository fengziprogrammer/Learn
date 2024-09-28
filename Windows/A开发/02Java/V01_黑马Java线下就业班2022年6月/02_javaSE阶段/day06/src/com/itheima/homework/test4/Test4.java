package com.itheima.homework.test4;

import java.util.ArrayList;

/*
    需求：定义一个方法 int listTest(ArrayList<Integer> list, Integer num)
    要求实现返回num在list里面第一次出现的索引，如果num没出现过返回-1。
 */
public class Test4 {
    public static void main(String[] args) {
        // 自行测试
    }

    public static int listTest(ArrayList<Integer> list, Integer num) {
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (integer == (int) num) {
                return i;
            }
        }
        return -1;
    }
}
