package com.itheima.interface_demo.interface_test2;

public class Girl extends Person{
    public Girl() {
    }

    public Girl(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("女同学爱学习....");
    }
}
