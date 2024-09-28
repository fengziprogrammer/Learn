package com.itheima.homework.work;

import java.util.ArrayList;

/*
    需求：

    1. 定义一个学生类Student，包含三个属性姓名、年龄、性别，私有成员变量,生成无参，有参构造方法，生成get/set方法。

    2. 创建三个学生对象存入ArrayList集合中。

    3. 找出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。

    4. 遍历集合输出对象属性信息。（输出格式如：姓名：张三, 年龄：23, 性别：男）
 */
public class Test2 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Student> list = new ArrayList<>(); //{s1 , s2 , s3}

        // 创建元素对象
        Student s1 = new Student("张三" , 23 , "男");
        Student s2 = new Student("王五" , 25 , "男");
        Student s3 = new Student("李四" , 24 , "男");

        // 把元素添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);

//        // 定义变量, 记录最大的年龄  参照物
//        int maxAge = list.get(0).getAge();      // 25
//        // 最大年龄学生在集合中的索引
//        int maxStudentAgeIndex = 0; // 1
//        for (int i = 1; i < list.size(); i++) {// i = 3
//            if(list.get(i).getAge() > maxAge){
//                maxAge = list.get(i).getAge();
//                maxStudentAgeIndex = i;
//            }
//        }

        // 最大年龄学生在集合中的索引
        int maxStudentAgeIndex = 0; // 1
        for (int i = 1; i < list.size(); i++) {// i = 2
            if(list.get(i).getAge() > list.get(maxStudentAgeIndex).getAge()){
                maxStudentAgeIndex = i;
            }
        }

        System.out.println(list.get(maxStudentAgeIndex));

        list.get(maxStudentAgeIndex).setName("小猪佩奇");
    }
}
