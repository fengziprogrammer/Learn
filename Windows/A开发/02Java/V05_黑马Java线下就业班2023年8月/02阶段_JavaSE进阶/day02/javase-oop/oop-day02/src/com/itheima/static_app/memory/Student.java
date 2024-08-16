package com.itheima.static_app.memory;

public class Student {
    String name;
    int age;

    //静态成员变量
    static String school;

    public void show() {
        System.out.println(name + "---" + age + "---" + school);
    }
}
