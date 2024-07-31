package com.atguigu.a_abstract;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setBrand("哈士奇");//继承的
        String brand = dog.getBrand();//继承的
        System.out.println("brand = " + brand);
        System.out.println("====================");
        dog.eat();//重写的
        dog.drink();//重写的
        dog.sleep();//重写的
        dog.la();//重写的
        dog.pee();//重写的

    }
}
