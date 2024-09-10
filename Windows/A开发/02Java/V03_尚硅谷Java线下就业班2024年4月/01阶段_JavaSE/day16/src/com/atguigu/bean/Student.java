package com.atguigu.bean;

import java.util.Objects;

public class Student implements Comparable{

    private  String name;
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
     重写后  比较的是属性值
     */
    @Override
    public boolean equals(Object o) {

        System.out.println("-------equals----------");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    /*
        作用
            1. 调用equals()
            2. 尽可能少调用equals()

            目的
                同一个对象  hash  一定一样
                同一种类型 属性值一样  hash  一定一样
                属性值不一样的 hash  尽可能不一样
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
        // return 1;
    }


    /*
    该方法的返回值 代表两个对象(对象为this与o)的差值  决定了如何排序
        0 两个对象一致  去重  -> 只保留第一个元素
        正数  后- 前 差值为正  后 > 前  --> 正序输出
        负数  后 < 前  --> 逆序输出

        需求
            按照学生的年龄正序排序,如果年龄一样,按照姓名排
     */
    @Override
    public int compareTo(Object o) {

        Student stu = (Student) o;

        int num = this.getAge() - stu.getAge();

        // 如果年龄差值为0 那么就按姓名排,否则还按年龄
        return  (num == 0) ? this.getName().compareTo(stu.getName()) :num;
    }
}
