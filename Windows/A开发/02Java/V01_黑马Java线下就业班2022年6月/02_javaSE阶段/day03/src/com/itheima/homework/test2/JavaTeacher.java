package com.itheima.homework.test2;

public class JavaTeacher extends Employee{

    public JavaTeacher() {
    }

    public JavaTeacher(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void work() {
        System.out.println("讲java课程...");
    }
}
