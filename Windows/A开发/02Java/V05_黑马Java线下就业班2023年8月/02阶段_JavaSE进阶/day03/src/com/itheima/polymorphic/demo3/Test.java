package com.itheima.polymorphic.demo3;

public class Test {
    public static void main(String[] args) {
        useAnimal(   new Cat()  );//把匿名对象作为参数，传递到方法中
        System.out.println("---------");

        useAnimal(new Dog());
        System.out.println("---------");


        useAnimal( new Pig() );


    }

    // 定义一个使用猫类的方法
    public static void useAnimal(Cat c) {// Cat c = new Cat();
        c.eat();
        c.catchMouse();
    }

    // 定义一个使用狗类的方法
    public static void useAnimal(Dog d) {// Dog d = new Dog();
        d.eat();
        d.lookDoor();
    }

    // 定义一个使用猪类的方法
    public static void useAnimal(Pig p){
        p.eat();
        p.sleep();
    }

}
