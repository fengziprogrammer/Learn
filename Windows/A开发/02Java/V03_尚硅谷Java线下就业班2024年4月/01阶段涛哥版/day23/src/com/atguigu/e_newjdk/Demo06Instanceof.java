package com.atguigu.e_newjdk;

public class Demo06Instanceof {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method(dog);
    }
    public static void method(Animal animal){
       /* if (animal instanceof Dog){
            animal.eat();
            Dog dog = (Dog) animal;
            dog.lookDoor();
        }*/

        //jdk16我们可以不用单独转型
        if (animal instanceof Dog dog){
            dog.eat();
            dog.lookDoor();
        }
    }
}
