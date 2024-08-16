package com.itheima.anonymous.base.app;

import java.util.ArrayList;

public class Test2 {
    public static void show(Student stu){
        System.out.println("学生姓名："+stu.getName());
        System.out.println("学生年龄："+stu.getAge());
    }

    public static void main(String[] args) {
//        //创建一个学生对象
//        Student stu = new Student("熊大",23);
//        //把创建的学生对象，作为参数传递
//        show(stu);


        //show( new Student("熊二",22)  );
        Student stu1 = new Student("张三", 23);


        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add( stu1 );
        //匿名对象，作为方法的参数
        studentList.add( new Student("李四",24) );
    }
}
