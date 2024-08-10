package com.atguigu.b_object;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        Person p1 = new Person("柳岩",36);
        Person p2 = new Person("涛哥",18);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.toString());//com.atguigu.b_object.Person@135fbaa4
        System.out.println(p2.toString());//com.atguigu.b_object.Person@45ee12a7

        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        System.out.println(list);// [abc, def]
    }
}
