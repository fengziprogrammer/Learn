package com.atguigu.demo;

public class Deaf extends Person implements Say{

    /*public Deaf() {

        System.out.println("-----zi--------空参");
    }

    public Deaf(String name,int age) {
        this.setName(name);
        this.setAge(age);
        System.out.println("-----zi--------有参");
    }*/

    public Deaf() {
    }

    public Deaf(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("---deaf---eat");
    }

    @Override
    public void show() {
        System.out.println("我是一个聋子类,我能吃,能说");
    }

    @Override
    public void say() {
        System.out.println("说的功能");
    }
}
