package com.itheima.homework.test1;

/*
    动物类
    属性：名称、年龄、性别
    行为：吃
 */
abstract class Animal {
    private String breed;
    private int age;
    private String sex;

    public Animal() {
    }

    public Animal(String breed, int age, String sex) {
        this.breed = breed;
        this.age = age;
        this.sex = sex;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public abstract void eat();
}
