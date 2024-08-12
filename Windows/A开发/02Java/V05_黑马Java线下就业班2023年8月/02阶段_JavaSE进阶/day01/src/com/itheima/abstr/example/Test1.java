package com.itheima.abstr.example;

public class Test1 {
    public static void main(String[] args) {
        //创建狗
        Dog dog = new Dog();
        dog.eat();
        dog.drink();
        System.out.println("=======================");
        //创建猎
        Cat cat = new Cat();
        cat.eat();
        cat.drink();
    }
}
