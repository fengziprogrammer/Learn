package com.atguigu.review;

public class TestConstructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.Student();

        System.currentTimeMillis();
    }
}

class Student{
    void Student(){
        System.out.println("不是无参构造，而是普通方法");
    }
}
