package com.atguigu.list;

import java.util.ArrayList;

public class Demo3 {

    /*
        List新增一种遍历方式
            for  利用索引
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ddd");
        list.add("ccc");
        System.out.println(list);

        for (int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
