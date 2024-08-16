package com.itheima.interface_app.demo1;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.interface_app.demo1
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 17 16
 * @Since JDK 17.0
 * @Description
 */
public abstract class Person {
    private String name;
    private int age;
    public abstract void study();

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}
