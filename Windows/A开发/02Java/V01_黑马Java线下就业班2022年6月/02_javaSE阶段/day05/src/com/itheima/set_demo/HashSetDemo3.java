package com.itheima.set_demo;

import java.util.HashSet;

/*
    练习 : 使用HashSet集合存储自定义对象并遍历

    HashSet集合要想保证元素的唯一性 , 那么集合中存储的元素所在的类就必须重写 hashCode 和 equals方法 !!!!
 */
public class HashSetDemo3 {
    public static void main(String[] args) {
        // 创建集合对象
        HashSet<Student> hs = new HashSet<>();

        // 创建元素对象
        Student s1 = new Student("李沁" , 18);
        Student s2 = new Student("李沁" , 18);
        Student s3 = new Student("柳岩" , 20);

        // 添加元素
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        // 遍历集合
        for (Student s : hs) {
            System.out.println(s);
        }
    }
}
