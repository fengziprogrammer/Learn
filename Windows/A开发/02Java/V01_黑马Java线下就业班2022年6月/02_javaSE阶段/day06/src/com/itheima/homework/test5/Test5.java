package com.itheima.homework.test5;

import sun.nio.cs.StreamDecoder;

import java.util.ArrayList;

/*
    1. 定义一个学生类Student，包含三个属性姓名、年龄、性别，私有成员变量
        生成无参，有参构造方法，生成get/set方法。
    2. 创建三个学生对象存入ArrayList集合中。
    3. 找出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
    4. 遍历集合输出对象属性信息。（输出格式如：姓名：张三, 年龄：23, 性别：男）
 */
public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        // 创建三个学生对象存入ArrayList集合中。
        Student s1 = new Student("张三", 23, "男");
        Student s2 = new Student("李四", 30, "女");
        Student s3 = new Student("王五", 20, "男");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxStudentIndex = 0;
        Student maxAgeStudent = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getAge() > maxAgeStudent.getAge()) {
                maxStudentIndex = i;
                maxAgeStudent = s;
            }
        }

        // 找出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
        list.get(maxStudentIndex).setName("小猪佩奇");

        for (Student student : list) {
            System.out.println(student);
        }

    }
}
