package com.atguigu.a_abstract;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void drink() {
        System.out.println("狗卷水喝");
    }

    @Override
    public void sleep() {
        System.out.println("狗趴着睡");
    }

    @Override
    public void la() {
        System.out.println("狗蹲着拉");
    }

    @Override
    public void pee() {
        System.out.println("狗抬腿尿");
    }
}
