package com.atguigu.set;

import com.atguigu.bean.Student;

import java.util.HashSet;
import java.util.LinkedList;

public class Demo2_HashSet {

    /*
        Set如何保证元素的唯一性
            泛型 : 自定义类
            HashSet
                重写equals()
                    比较地址值 -> 比较属性值
                重写hashCode()
                    1. 调用equals()
                    2. 尽可能少调用equals()

                    目的
                        同一个对象  hash  一定一样
                        同一种类型 属性值一样  hash  一定一样
                        属性值不一样的 hash  尽可能不一样

     */
    public static void main(String[] args) {

       /* HashSet<String> set = new HashSet<>();

        set.add("aa");
        set.add("aa");
        set.add("bb");
        set.add("bb");
        set.add("ccc");
        System.out.println(set);*/

        HashSet<Student> set = new HashSet<>();

        set.add(new Student("张三",23));
        set.add(new Student("张三",23));
        set.add(new Student("李四",24));
        set.add(new Student("李四",24));
        set.add(new Student("王五",25));
        System.out.println(set);
        System.out.println(set.size());
    }
}
