package com.atguigu.f_fanxing;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        list1.add("赵六");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        method(list1);
        method(list2);
    }

    public static void method(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
