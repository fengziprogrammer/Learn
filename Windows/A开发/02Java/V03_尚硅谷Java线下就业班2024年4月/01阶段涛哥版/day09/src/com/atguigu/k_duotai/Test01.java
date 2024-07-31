package com.atguigu.k_duotai;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method(dog);

        Cat cat = new Cat();
        method(cat);
    }

    public static void method(Animal animal) {//Animal animal = Dog  Animal animal = Cat
        if (animal instanceof Dog){
            animal.eat();
            //向下转型
            Dog dog = (Dog) animal;
            dog.lookDoor();
        }

        if (animal instanceof Cat){
            animal.eat();
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

    }
}
