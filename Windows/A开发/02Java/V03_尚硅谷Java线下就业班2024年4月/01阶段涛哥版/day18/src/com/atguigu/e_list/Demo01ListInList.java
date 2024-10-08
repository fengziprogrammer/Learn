package com.atguigu.e_list;

import java.util.ArrayList;

public class Demo01ListInList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("洪七公");
        list1.add("黄老邪");
        list1.add("欧阳锋");
        list1.add("一灯大师");
        list1.add("王重阳");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("东方不败");
        list2.add("岳不群");
        list2.add("林平之");

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);

        //先遍历list集合,将两个小集合遍历出来
        for (ArrayList<String> arrayList : list) {
            for (String s : arrayList) {
                System.out.println(s);
            }
        }
    }
}
