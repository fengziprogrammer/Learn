package com.itheima.abstract_demo.test;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String breed, String color, int age) {
        super(breed, color, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉...");
    }

    public void lookDoor() {
        System.out.println("狗看门...");
    }
}
