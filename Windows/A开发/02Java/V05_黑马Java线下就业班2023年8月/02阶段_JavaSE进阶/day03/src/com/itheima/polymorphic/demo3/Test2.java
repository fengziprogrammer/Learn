package com.itheima.polymorphic.demo3;

public class Test2 {
    public static void main(String[] args) {
        //Cat、Dog、Pig 都继承 Animal（父类）

        useAnimal(new Cat());//把匿名对象作为参数，传递到方法中
        System.out.println("---------");

        useAnimal(new Dog());
        System.out.println("---------");

        useAnimal(new Pig());
    }

    //使用多态 ： 参数为父类型
    public static void useAnimal(Animal animal) {//animal = 猫对象
        animal.eat();

        //多态：调用子类中的特有方法
        if(animal instanceof Cat ){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }else if(animal instanceof  Dog){
            Dog dog = (Dog) animal;
            dog.lookDoor();
        }else if(animal instanceof  Pig){
            Pig pig = (Pig) animal;
            pig.sleep();
        }
    }
}
