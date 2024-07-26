package com.atguigu.g_extends;

public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    @Override
    public Cat drink(){
        return new Cat();
    }


   /* public Animal sleep(){
        return new Animal();
    }*/
}
