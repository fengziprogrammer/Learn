package com.itheima.extends_contructor;

public class Animal {
    private String breed;// 品种
    private String color;// 颜色

    public Animal() {
    }

    public Animal(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("吃东西...");
    }

    public void drink() {
        System.out.println("喝水...");
    }

}
