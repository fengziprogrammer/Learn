package com.atguigu.b_tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo01TreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("b");
        treeSet.add("d");
        treeSet.add("a");
        treeSet.add("c");
        System.out.println(treeSet);
        System.out.println("================");

        TreeSet<Person> treeSet1 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        treeSet1.add(new Person("柳岩",36));
        treeSet1.add(new Person("涛哥",18));
        treeSet1.add(new Person("曼曼",48));
        System.out.println(treeSet1);
    }
}
