package com.atguigu.c_list;

import java.util.LinkedList;

public class Demo06LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("虹猫蓝兔七侠传");
        list.add("海绵宝宝");
        list.add("天线宝宝");
        list.add("花园宝宝");
        //public E pop():从此列表所表示的堆栈处弹出一个元素。
        list.pop();
        System.out.println(list);
        //public void push(E e):将元素推入此列表所表示的堆栈。
        list.push("曼曼");
        System.out.println(list);
    }
}
