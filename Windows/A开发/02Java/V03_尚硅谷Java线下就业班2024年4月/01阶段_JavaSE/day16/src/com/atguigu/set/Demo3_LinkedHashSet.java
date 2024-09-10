package com.atguigu.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo3_LinkedHashSet {

    /*

        LinkedHashSet 可以保证存取有序
     */
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(11);
        set.add(11);
        set.add(33);
        set.add(22);
        set.add(22);
        System.out.println(set);
    }
}
