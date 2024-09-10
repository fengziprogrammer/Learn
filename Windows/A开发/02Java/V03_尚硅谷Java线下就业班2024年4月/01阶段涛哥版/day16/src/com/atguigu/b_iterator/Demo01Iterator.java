package com.atguigu.b_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("贾宝玉");
        list.add("林黛玉");
        list.add("王熙凤");
        list.add("刘姥姥");
        list.add("探春");
        //获取Iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("element = " + element);
        }
    }
}
