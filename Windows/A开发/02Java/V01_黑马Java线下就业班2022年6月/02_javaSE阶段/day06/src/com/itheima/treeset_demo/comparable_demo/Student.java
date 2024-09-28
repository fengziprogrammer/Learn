package com.itheima.treeset_demo.comparable_demo;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    @Override
    public int compareTo(Student o) {
        /*
            this : 当前添加的学生对象
            o : 集合中已存在的学生对象
         */
        // 按照学生的年龄升序排序
        int result = this.age - o.age;
        // 年龄如果相同根据姓名排序
        return  result == 0 ? this.name.compareTo(o.name) : result;
    }
}
