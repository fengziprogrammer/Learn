package com.itheima.polymorphic.demo3;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String breed, String color) {
        super(breed, color);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头!");
    }

    //特有方法
    public void lookDoor(){
        System.out.println("狗看门...");
    }
}