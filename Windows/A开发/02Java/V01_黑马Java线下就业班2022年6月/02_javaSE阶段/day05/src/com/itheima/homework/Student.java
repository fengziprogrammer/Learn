package com.itheima.homework;

public class Student {
    private String name;
    private int age;
    private double height;
    private boolean isHun;
    private char sex;

    public Student() {
    }

    public Student(String name, int age, double height, boolean isHun, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isHun = isHun;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHun() {
        return isHun;
    }

    public void setHun(boolean hun) {
        isHun = hun;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", isHun=" + isHun +
                ", sex=" + sex +
                '}';
    }
}
