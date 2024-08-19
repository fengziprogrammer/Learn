package com.itheima.extends_contructor;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String breed, String color) {
        super(breed, color);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫逮老鼠...");
    }
}
