package com.itheima.extends_contructor;

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

    public void lookHome() {
        System.out.println("狗看家..");
    }
}
