package com.itheima.collections_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    Collections类 : 单列集合的工具类
        sort方法是一个重载的方法，可以实现自然排序及比较器排序。
        要特别注意的是sort方法只能对List集合进行排序，方法如下：

        public static <T extends Comparable> void sort (List<T> list , Comparator<? super T> c) : 自己指定排序的规则

        需求1：定义一个List集合，存储若干整数，要求对集合进行降序排序
        分析：整数类型Integer具备自然排序能力，但是题目要求降序排序

        需求2：定义一个学生类，属性有姓名，年龄。创建若干对象放到List集合中。要求对List集合中学生对象进行年龄的升序排序。
        分析：自定义类型默认是没有自然排序能力的，我们使用自定义比较器方式排序。
 */
public class SortDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 24);
        Student s2 = new Student("李四", 23);
        list.add(s1);
        list.add(s2);

        //  public static <T extends Comparable> void sort (List<T> list , Comparator<? super T> c) : 自己指定排序的规则
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });

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

        //  public static <T extends Comparable> void sort (List<T> list , Comparator<? super T> c) : 自己指定排序的规则
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(list);
    }
}
