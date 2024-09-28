package com.itheima.collections_demo;

import java.util.ArrayList;
import java.util.Collections;

/*
    Collections类 : 单列集合的工具类
        sort方法是一个重载的方法，可以实现自然排序及比较器排序。
        要特别注意的是sort方法只能对List集合进行排序，方法如下：

        public static <T extends Comparable> void sort(List<T> list )

        需求 : 定义List集合，存储若干整数，进行升序排序
 */
public class SortDemo1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 24);
        Student s2 = new Student("李四", 23);
        list.add(s1);
        list.add(s2);

        // public static <T extends Comparable> void sort( List<T> list )
        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s);
        }

    }

    private static void method() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);

        //  public static <T extends Comparable> void sort( List<T> list )
        Collections.sort(list);

        System.out.println(list);
    }
}
