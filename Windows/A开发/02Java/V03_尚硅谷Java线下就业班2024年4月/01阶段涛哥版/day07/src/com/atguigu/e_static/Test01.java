package com.atguigu.e_static;

public class Test01 {
    public static void main(String[] args) {
        //类名直接调用
        Student.classRoom = "222";


        Student s1 = new Student();
        s1.name = "郭靖";
        //s1.classRoom = "222";
        System.out.println(s1.name);
        System.out.println(s1.classRoom);

        //类名直接调用
        Student.study();

        System.out.println("====================");

        Student s2 = new Student();
        s2.name = "黄蓉";
        //s2.classRoom = "222";
        System.out.println(s2.name);
        System.out.println(s2.classRoom);

        //类名直接调用
        Student.study();
    }
}
