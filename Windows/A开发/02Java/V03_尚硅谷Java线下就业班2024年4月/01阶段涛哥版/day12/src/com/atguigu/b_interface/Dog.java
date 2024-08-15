package com.atguigu.b_interface;

import java.util.Objects;

public class Dog implements Cloneable{
    private String color;
    private int age;

    public Dog() {
    }

    public Dog(String color, int age) {
        this.color = color;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(color, dog.color);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
