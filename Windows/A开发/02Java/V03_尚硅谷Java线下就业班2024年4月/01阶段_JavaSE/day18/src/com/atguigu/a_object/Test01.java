package com.atguigu.a_object;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method(dog);

        Cat cat = new Cat();
        method(cat);
    }

    public static void method(Animal animal){
        animal.eat();
    }
}
