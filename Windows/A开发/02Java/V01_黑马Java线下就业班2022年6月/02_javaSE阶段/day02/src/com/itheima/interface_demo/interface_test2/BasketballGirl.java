package com.itheima.interface_demo.interface_test2;

public class BasketballGirl extends Girl implements PlayBasketball{
    public BasketballGirl() {
    }

    public BasketballGirl(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("打篮球的女同学...");
    }
}
