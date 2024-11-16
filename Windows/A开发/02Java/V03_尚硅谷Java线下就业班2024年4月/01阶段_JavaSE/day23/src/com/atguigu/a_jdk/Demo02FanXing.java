package com.atguigu.a_jdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo02FanXing {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("柳岩",36));
        list.add(new Person("曼曼",48));
        list.add(new Person("涛哥",18));
        Collections.sort(list, new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list);
    }
}
