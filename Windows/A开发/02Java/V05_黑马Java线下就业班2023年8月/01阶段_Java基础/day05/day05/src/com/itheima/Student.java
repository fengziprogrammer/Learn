package com.itheima;

/*
    学生类
 */
public class Student {
    //成员变量,必须私有
    private String name;
    private int age;

    //构造方法
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //针对被私有的属性,提供对应的get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //成员方法
    public void study() {
        System.out.println("学生在学习...");
    }

    public void eat() {
        System.out.println("学生在吃饭...");
    }
}
