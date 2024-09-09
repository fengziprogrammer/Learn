package com.itheima.homework.test1;

class Cat extends Animal {

    public Cat() {
    }

    public Cat(String breed, int age, String sex) {
        super(breed, age, sex);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }

    public void catchMouse() {
        System.out.println("抓老鼠..");
    }
}
