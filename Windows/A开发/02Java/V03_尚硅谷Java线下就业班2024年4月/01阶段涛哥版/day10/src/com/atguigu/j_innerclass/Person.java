package com.atguigu.j_innerclass;

public class Person {
    public void eat(){
        System.out.println("人要干饭");
        //new Heart().jump();
    }

    class Heart{
        public void jump(){
            System.out.println("心脏在哐哐哐跳");
            //eat();
            new Person().eat();
        }
    }
}
