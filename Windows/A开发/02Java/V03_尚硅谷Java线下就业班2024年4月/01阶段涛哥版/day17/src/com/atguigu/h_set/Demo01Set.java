package com.atguigu.h_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo01Set {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
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
