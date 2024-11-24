package com.itheima.homework.work;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -123L;

    private String name;
    private String sex;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String name, String sex, int age, int score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return name + "," + sex + "," + age + "," + score;
    }
}
