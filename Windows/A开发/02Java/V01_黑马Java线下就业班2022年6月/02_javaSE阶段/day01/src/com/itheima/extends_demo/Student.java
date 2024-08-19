package com.itheima.extends_demo;
/*
     子类
     子类可以继承父类的私有成员, 但是无法访问
 */
public class Student extends Person{
    private String id;

    public Student() {
    }

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void study() {
        System.out.println(getName());
        System.out.println("学习...");
    }
}
