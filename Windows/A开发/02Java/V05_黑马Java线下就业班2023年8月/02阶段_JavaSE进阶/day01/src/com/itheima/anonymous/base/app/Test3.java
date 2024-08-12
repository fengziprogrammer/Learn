package com.itheima.anonymous.base.app;

public class Test3 {
    //匿名对象，作为方法的返回值
    public static Student createStudent(String name, int age){
       return new Student(name ,age);
    }

    public static void main(String[] args) {
        Student stu = createStudent("光头强", 24);

        System.out.println("姓名："+stu.getName());
    }
}
