package com.atguigu.j_hashset;

import java.util.HashSet;

public class Demo02HashSet {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("柳岩",36));
        set.add(new Person("涛哥",18));
        set.add(new Person("曼曼",48));
        set.add(new Person("曼曼",48));
        System.out.println(set);
    }
}
