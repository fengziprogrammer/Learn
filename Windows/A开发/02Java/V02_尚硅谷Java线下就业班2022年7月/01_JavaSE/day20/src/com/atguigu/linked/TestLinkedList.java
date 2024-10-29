package com.atguigu.linked;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.remove("hello");
        Iterator<String> iterator = list.iterator();

    }
}
