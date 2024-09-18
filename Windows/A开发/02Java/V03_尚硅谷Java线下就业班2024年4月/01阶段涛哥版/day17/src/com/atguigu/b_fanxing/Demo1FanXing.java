package com.atguigu.b_fanxing;

import java.util.ArrayList;

public class Demo1FanXing {
    public static void main(String[] args) {
        //定义一个集合,存储整型,字符串,布尔等类型数据,获取元素中字符串的长度
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add("abc");
        list.add("def");
        list.add(2.5);
        list.add(true);

        for (Object o : list) {
            String s = (String) o;//ClassCastException
            System.out.println(s.length());
        }
    }
}
