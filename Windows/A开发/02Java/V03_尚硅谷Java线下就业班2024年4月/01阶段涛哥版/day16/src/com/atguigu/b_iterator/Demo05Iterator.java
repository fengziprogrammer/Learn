package com.atguigu.b_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo05Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("唐僧");
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");

        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            if ("猪八戒".equals(element)){
                iterator.add("白龙马");
            }
        }
        System.out.println(list);
    }
}
