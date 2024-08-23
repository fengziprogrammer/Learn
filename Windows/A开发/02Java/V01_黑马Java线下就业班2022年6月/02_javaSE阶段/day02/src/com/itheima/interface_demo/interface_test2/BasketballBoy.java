package com.itheima.interface_demo.interface_test2;

public class BasketballBoy extends Boy implements PlayBasketball{
    public BasketballBoy() {
    }

    public BasketballBoy(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("打篮球的男同学...");
    }
}
