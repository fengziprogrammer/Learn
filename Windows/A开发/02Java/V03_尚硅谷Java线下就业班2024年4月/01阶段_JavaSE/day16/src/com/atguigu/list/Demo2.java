package com.atguigu.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ddd");
        list.add("ccc");
        System.out.println(list);

        list.add(1,"***");
        System.out.println(list);
        System.out.println(list.remove(3));
        System.out.println(list);// [aaa, ***, aaa, ddd, ccc]

        System.out.println(list.set(2, "888"));
        System.out.println(list);// [aaa, ***, 888, ddd, ccc]

        System.out.println(list.get(0));

        System.out.println("-----------------");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
        list2.remove(1);// 如果元素类型刚好是Integer remove(1)  默认参数是index
        System.out.println(list2);

        LinkedList list3 = new LinkedList();
        list3.add(123);
        System.out.println(list3.get(0));


    }
}
