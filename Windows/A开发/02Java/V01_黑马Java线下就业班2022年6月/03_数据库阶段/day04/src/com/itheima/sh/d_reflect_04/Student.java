package com.itheima.sh.d_reflect_04;

public class Student {
    //成员变量
    private String name;
    private int age;

    //构造方法

    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //定义方法
    public void show(){
        System.out.println(this.name+"---"+this.age);
    }

    public void method(){
        System.out.println("method....");
    }
}
