package com.atguigu.j_duotai;

public class Test02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method(dog);

        Cat cat = new Cat();
        method(cat);
    }

    public static void method(Animal animal) {//Animal animal = Dog  Animal animal = Cat
        animal.eat();
    }
}
