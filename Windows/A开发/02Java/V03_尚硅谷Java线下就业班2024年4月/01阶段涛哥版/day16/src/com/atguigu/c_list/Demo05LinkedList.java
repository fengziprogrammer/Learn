package com.atguigu.c_list;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo05LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("虹猫蓝兔七侠传");
        list.add("海绵宝宝");
        list.add("天线宝宝");
        list.add("花园宝宝");
        list.add("托马斯小火车");
        list.add("数码宝贝");
        list.add("神奇宝贝");
        list.add("游戏王");
        list.add("灌篮高手");
        list.add("火影忍者");
        System.out.println(list);
        //- public void addFirst(E e):将指定元素插入此列表的开头。
        list.addFirst("网球王子");
        System.out.println(list);
        //- public void addLast(E e):将指定元素添加到此列表的结尾。
        list.addLast("七龙珠");
        System.out.println(list);
        //- public E getFirst():返回此列表的第一个元素。
        System.out.println(list.getFirst());
        //- public E getLast():返回此列表的最后一个元素。
        System.out.println(list.getLast());
        //- public E removeFirst():移除并返回此列表的第一个元素。
        System.out.println(list.removeFirst());
        System.out.println(list);
        //- public E removeLast():移除并返回此列表的最后一个元素。
        System.out.println(list.removeLast());
        System.out.println(list);
        //- public boolean isEmpty()：如果列表不包含元素，则返回true。
        System.out.println(list.isEmpty());

        System.out.println("===================================");
        //迭代器
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("===================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
