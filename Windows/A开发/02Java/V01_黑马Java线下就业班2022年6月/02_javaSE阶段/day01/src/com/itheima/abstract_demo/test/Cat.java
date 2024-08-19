package com.itheima.abstract_demo.test;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String breed, String color, int age) {
        super(breed, color, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }

    public void catchMouse() {
        System.out.println("猫逮老鼠...");
    }
}
