package com.itheima.api_demo.object_demo;

public class Student extends Object {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {// Object o = new Student("李沁", 18)
        /*
            this : s1
            o    : s2
         */

        // 比较的是两个对象的地址
        // 提高代码执行效率
        if (this == o) {
            return true;
        }

        // if (o == null || getClass() != o.getClass()){
        // getClass() : 获取的是一个类的字节码对象,一个类的字节码对象是唯一的
        // 判断两个对象的类型是否是一致的
        // o == null : 非空判断 , 提高代码的健壮性
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }

        // student : s2
        // 向下转型
        Student student = (Student) o;

        if (this.age != student.age) {
            return false;
        }

        return this.name != null ? this.name.equals(student.name) : student.name == null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
