package com.atguigu.g_extends;

public class Animal {
    public void eat(){
        System.out.println("动物要干饭");
    }

    public Animal drink(){
        return new Animal();
    }

    public Cat sleep(){
        return new Cat();
    }
}
