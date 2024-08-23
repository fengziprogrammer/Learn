package com.itheima.interface_demo.interface_test2;

public class Boy extends Person{

    public Boy() {
    }

    public Boy(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("男同学不爱学习...");
    }
}
