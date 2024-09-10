package com.atguigu.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo4 {

    /*
    LinkedList特有的方法
     */
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ddd");
        list.add("ccc");
        System.out.println(list);

        list.addFirst("888");
        System.out.println(list);//[888, aaa, aaa, bbb, ddd, ccc]
        list.addLast("999");
        System.out.println(list);// [888, aaa, aaa, bbb, ddd, ccc, 999]

        System.out.println("--------------");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("-----------------");
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);

    }
}
