package com.itheima.homework.work;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

    }

    // 返回的是num在集合中出现的第一次索引 , 如果num在集合中没有出现, 则返回-1
    // {33,22,33,11,55,44}  , num = 77
    public static int listTest(ArrayList<Integer> list, Integer num) {
        int index = -1;
        // false  : num在集合中不存在
        boolean flag = false; // false

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == (int) num) {
                index = i;
                flag = true;
                break;// 停掉循环
            }
        }

        if (flag) {
            // 存在
            return index;
        } else {
            // 不存在
            return index;
        }

//        // 遍历集合
//        for (int i = 0; i < list.size(); i++) {
//            // 根据索引获取集合中的元素
//            Integer integer = list.get(i);
////            if(integer == num){// 比较的是地址
//            if (integer == (int) num) {// num强转为基本类型int(自动拆箱) , 一个Integer和一个int用==作比较 , 会把Integer自动拆箱为int在作比较
//                return i;
//            }
//        }
//
//        return -1;// num在集合中不存在!
    }

}
