package com.itheima.homework.work;

public class Student {
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
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
        //   在年龄的set方法中判断年龄是否是15--50之间，如果不是则抛出：年龄异常
        if (age >= 15 && age <= 50) {
            this.age = age;
        } else {
            throw new AgeException("年龄有误, 只能在15-50之间!");
        }

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        // 在性别的set方法中判断是否是男/女，如果不是则抛出：性别异常
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            throw new SexException("传入性别有误!只有是男或女.");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
