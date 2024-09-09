package com.itheima.homework.test1;

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String breed, int age, String sex) {
        super(breed, age, sex);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("狗看家...");
    }
}
