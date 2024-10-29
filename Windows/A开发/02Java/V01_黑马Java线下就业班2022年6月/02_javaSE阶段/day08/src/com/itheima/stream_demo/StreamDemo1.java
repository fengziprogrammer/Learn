package com.itheima.stream_demo;

//import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.Collections;

/*
    体验Stream流的好处

    需求：按照下面的要求完成集合的创建和遍历
        1 创建一个集合，存储多个字符串元素
            "张无忌" , "张翠山" , "张三丰" , "谢广坤" , "赵四" , "刘能" , "小沈阳" , "张良"
        2 把集合中所有以"张"开头的元素存储到一个新的集合
        3 把"张"开头的集合中的长度为3的元素存储到一个新的集合
        4 遍历上一步得到的集合

 */
public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "张翠山", "张三丰", "谢广坤", "赵四", "刘能", "小沈阳", "张良");

        // 2 把集合中所有以"张"开头的元素存储到一个新的集合
        ArrayList<String> newList1 = new ArrayList<>();// "张无忌", "张翠山", "张三丰", "张良"

        for (String s : list) {
            if (s.startsWith("张")) {
                newList1.add(s);
            }
        }

        ArrayList<String> newList2 = new ArrayList<>();

        for (String s : newList1) {
            if (s.length() == 3) {
                newList2.add(s);
            }
        }

        for (String s : newList2) {
            System.out.println(s);
        }

        System.out.println("===============================");

        list.stream().filter(s -> s.startsWith("张") && s.length() == 3).forEach(s -> System.out.println(s));

    }
}
