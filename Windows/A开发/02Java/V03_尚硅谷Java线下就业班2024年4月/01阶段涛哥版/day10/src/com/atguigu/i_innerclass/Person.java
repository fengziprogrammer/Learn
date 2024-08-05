package com.atguigu.i_innerclass;

public class Person {
    public void eat(){
        System.out.println("人要吃饭");
        new Heart().jump();
    }
    //静态成员内部类
    static class Heart{
       public void jump(){
           System.out.println("心在咣咣咣的跳");

           //eat();
           new Person().eat();
       }
    }
}

