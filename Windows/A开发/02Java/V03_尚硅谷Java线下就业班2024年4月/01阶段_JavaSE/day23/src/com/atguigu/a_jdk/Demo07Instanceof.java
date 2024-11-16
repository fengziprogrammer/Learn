package com.atguigu.a_jdk;

public class Demo07Instanceof {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method(dog);
    }
    public static void method(Animal animal){
        if (animal instanceof Dog dog){
            animal.eat();
            //Dog dog = (Dog) animal;
            dog.lookDoor();
        }
    }
}
