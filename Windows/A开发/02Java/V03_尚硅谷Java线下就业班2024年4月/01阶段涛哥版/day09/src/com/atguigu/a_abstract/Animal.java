package com.atguigu.a_abstract;

public abstract class Animal {
    private String brand;

    public Animal() {
    }

    public Animal(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //抽象方法
    public abstract void eat();
    public abstract void drink();
    public abstract void sleep();
    public abstract void la();
    public abstract void pee();
}
