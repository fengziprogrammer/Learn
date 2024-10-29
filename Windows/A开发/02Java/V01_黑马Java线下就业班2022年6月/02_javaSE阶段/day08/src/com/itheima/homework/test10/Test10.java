package com.itheima.homework.test10;

import java.util.*;

/*
    需求：一个年级有若干个班级，每个班级有若干个学生；要求：
    1. 学生具有学号、姓名和成绩，学号和学生信息是一一对应的；
    2. 使用集合保存这个年级的所有学生的信息，然后遍历输出；

    思路：
    - 班级：Map<Integer,Student> 键：学号，值：学生对象
    - 年级：List<Map<Integer,Student>> 使用List集合将每个班级保存
 */
public class Test10 {
    public static void main(String[] args) {
        // 创建年级集合
        List<Map<Integer, Student>> list = new ArrayList<>();

        // 创建第一个班级
        Map<Integer, Student> classNumber1 = new HashMap<>();
        classNumber1.put(111, new Student("张三"));
        classNumber1.put(222, new Student("李四"));
        classNumber1.put(333, new Student("王五"));

        // 创建第二个班级
        Map<Integer, Student> classNumber2 = new HashMap<>();
        classNumber2.put(444, new Student("赵六"));
        classNumber2.put(555, new Student("钱⑦"));

        // 把班级添加到年级中
        list.add(classNumber1);
        list.add(classNumber2);

        for (Map<Integer, Student> classNumbers : list) {
            Set<Integer> set = classNumbers.keySet();
            for (Integer id : set) {
                Student student = classNumbers.get(id);
                System.out.println(id + "---" + student);
            }

            System.out.println("==============");
        }
    }
}
