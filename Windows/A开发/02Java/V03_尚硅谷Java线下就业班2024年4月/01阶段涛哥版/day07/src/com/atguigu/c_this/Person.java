package com.atguigu.c_this;

public class Person {
    private String name;
    private int age;

    //空参构造
    public Person(){

    }

    //有参构造
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //针对name提供set方法
    public void setName(String name) {
        this.name = name;
    }

    //针对name提供get方法
    public String getName() {
        return name;
    }

    //针对age提供set方法
    public void setAge(int age) {
       this.age = age;
    }

    //针对age提供get方法
    public int getAge() {
        return age;
    }
}
