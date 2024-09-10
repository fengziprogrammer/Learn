package com.atguigu.b_iterator;

import java.util.HashSet;
import java.util.Iterator;

public class Demo03Iterator {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        Iterator<String> iterator = set.iterator();
    }
}
