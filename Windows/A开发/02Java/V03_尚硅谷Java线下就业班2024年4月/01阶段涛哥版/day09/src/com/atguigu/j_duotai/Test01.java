package com.atguigu.j_duotai;

public class Test01 {
    public static void main(String[] args) {
        //原始方式new对象
        Dog dog = new Dog();
        method(dog);

        Cat cat = new Cat();
        method(cat);

        //TaoGe taoGe = new TaoGe();
        //method(taoGe);

        //Bird bird = new Bird();
        //method(bird);
    }
    public static void method(Dog dog){
        dog.eat();
        dog.lookDoor();
    }

    public static void method(Cat cat){
        cat.eat();
        cat.catchMouse();
    }

    /*public static void method(TaoGe taoge){

    }*/

   /* public static void method(Bird bird){

    }*/
}
