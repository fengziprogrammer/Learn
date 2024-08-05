package com.atguigu.m_innerclass;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method01(dog);
        System.out.println("=============");
        Animal animal = method02();//method02()接收的是返回回来的Dog对象
        animal.eat();
    }
    public static void method01(Animal animal){//Animal animal = dog
        animal.eat();
    }

    public static Animal method02(){
        Dog dog = new Dog();
        return dog;
    }
}
