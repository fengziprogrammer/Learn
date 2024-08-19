package com.itheima.abstract_demo.test;

public abstract class Animal {
    private String breed;
    private String color;
    private int age;

    public Animal() {
    }

    public Animal(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void drink(){
        System.out.println("喝水...");
    }

    public abstract void eat();
}
