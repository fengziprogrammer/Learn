package com.itheima.polymorphic_demo;

/*
    多态 : 一个对象, 在不同时刻体现出来的不同形态

    多态前提 :
        1 需要有继承/实现的关系
        2 方法重写
        3 父类的引用指向子类的对象/接口的引用指向实现类的对象
 */
public class Test1 {
    public static void main(String[] args) {
        // 多态对象
        Animal a = new Dog();

    }
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头!");
    }
}