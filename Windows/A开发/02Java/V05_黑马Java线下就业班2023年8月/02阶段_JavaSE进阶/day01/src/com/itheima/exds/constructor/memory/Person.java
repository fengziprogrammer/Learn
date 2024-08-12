package com.itheima.exds.constructor.memory;

//人 （父类）
public class Person {
    //成员变量
    private String name;
    private int age;

    //成员方法
    public void show() {
        System.out.println(name + "-----" + age);
    }


//    public Person() {
//    }

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
