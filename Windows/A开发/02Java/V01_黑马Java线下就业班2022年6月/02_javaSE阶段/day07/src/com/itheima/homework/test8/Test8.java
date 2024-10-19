package com.itheima.homework.test8;

import java.util.LinkedHashMap;

/*
    需求：使用LinkedHashMap保存学生对象，及其对应的家庭住址；要求：
        1. 学生具有学号、姓名和成绩三个属性；
        2. 其中，学号不能重复；

    思路：
        - 要重写hashCode和equals方法，学号不能重复，只要选中学号即可。
 */
public class Test8 {
    public static void main(String[] args) {
        LinkedHashMap<Student, String> linkedHashMap = new LinkedHashMap<>();

        Student s1 = new Student("it001" , "柳岩", 100);
        Student s2 = new Student("it002" , "景甜", 80);
        Student s3 = new Student("it003" , "李沁", 90);

        linkedHashMap.put(s1 , "哈尔滨");
        linkedHashMap.put(s2 , "青岛");
        linkedHashMap.put(s3 , "呼和浩特");

        System.out.println(linkedHashMap);
    }
}
