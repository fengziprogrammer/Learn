package com.atguigu.h_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo02Set {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("张三");
        set1.add("李四");
        set1.add("王五");
        set1.add("赵六");
        set1.add("田七");
        set1.add("张三");
        System.out.println(set1);

        System.out.println("--------------------");

        Iterator<String> iterator = set1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-------------------");

        for (String s : set1) {
            System.out.println(s);
        }

    }
}
