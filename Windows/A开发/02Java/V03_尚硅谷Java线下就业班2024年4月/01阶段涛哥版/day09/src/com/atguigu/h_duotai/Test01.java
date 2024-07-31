package com.atguigu.h_duotai;

public class Test01 {
    public static void main(String[] args) {
        //原始方式new对象
        Dog dog = new Dog();
        dog.eat();
        dog.lookDoor();
        System.out.println("==========");
        Cat cat = new Cat();
        cat.eat();
        cat.catchMouse();

        System.out.println("==========");

        //多态形式new对象
        Animal animal = new Dog();
        animal.eat();
        //animal.lookDoor();//多态前提下,不能直接调用子类特有功能
        System.out.println("=======");

        Animal animal1 = new Cat();
        animal1.eat();
        //animal1.catchMouse();//多态前提下,不能直接调用子类特有功能

    }
}
