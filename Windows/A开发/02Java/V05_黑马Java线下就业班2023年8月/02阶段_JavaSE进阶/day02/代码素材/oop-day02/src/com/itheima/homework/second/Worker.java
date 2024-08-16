package com.itheima.homework.second;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.homework.second
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 18 13
 * @Since JDK 17.0
 * @Description
 */
public abstract class Worker {
    private String name;
    private String sex;
    private int age;

    public Worker() {
    }

    public Worker(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public abstract void work();

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

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
