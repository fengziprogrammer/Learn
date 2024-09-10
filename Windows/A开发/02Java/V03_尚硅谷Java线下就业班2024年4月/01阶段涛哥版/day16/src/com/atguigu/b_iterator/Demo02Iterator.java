package com.atguigu.b_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo02Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("唐三藏");
        list.add("孙悟空");
        list.add("猪悟能");
        list.add("沙悟净");
        list.add("白龙马");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(iterator.next());
        }
    }
}
