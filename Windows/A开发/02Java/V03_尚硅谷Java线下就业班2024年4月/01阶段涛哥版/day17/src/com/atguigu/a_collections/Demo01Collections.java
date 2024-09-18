package com.atguigu.a_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // static <T> boolean addAll(Collection<? super T> c, T... elements)->批量添加元素
        Collections.addAll(list,"张三","李四","王五","赵六","田七","猪八");
        System.out.println(list);
        List<String> list1 = Arrays.asList("张三", "李四", "王五");
        System.out.println("list1 = " + list1);

        System.out.println("===========================================");
        // static void shuffle(List<?> list) ->将集合中的元素顺序打乱
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("===========================================");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("by");
        list2.add("c");
        list2.add("d");
        list2.add("a");
        list2.add("bi");
        // static <T> void sort(List<T> list) ->将集合中的元素按照默认规则排序 -> ASCII
        Collections.sort(list2);
        System.out.println(list2);
    }
}
