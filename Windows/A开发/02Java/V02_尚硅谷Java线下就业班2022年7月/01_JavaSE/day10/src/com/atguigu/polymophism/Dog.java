package com.atguigu.polymophism;

public class Dog extends Pet{
    @Override
    public void eat(){
        System.out.println("啃骨头");
    }

    public void watchHouse(){
        System.out.println("看家");
    }
}
