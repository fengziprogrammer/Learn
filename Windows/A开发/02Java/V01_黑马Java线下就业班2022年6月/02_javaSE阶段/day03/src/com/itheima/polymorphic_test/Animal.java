package com.itheima.polymorphic_test;

// 父类
public abstract class Animal {
    public abstract void eat();

    public void drink() {
        System.out.println("喝水....");
    }
}

// 子类
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉!");
    }

    public void lookHome() {
        System.out.println("看家...");
    }
}

// 子类
class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠...");
    }
}

// 子类
class Pig extends Animal {

    @Override
    public void eat() {
        System.out.println("猪拱白菜...");
    }

    public void sleep() {
        System.out.println("猪特能睡...");
    }
}
