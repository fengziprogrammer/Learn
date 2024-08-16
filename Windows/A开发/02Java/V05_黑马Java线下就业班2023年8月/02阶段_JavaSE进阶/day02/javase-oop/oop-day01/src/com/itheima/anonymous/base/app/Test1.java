package com.itheima.anonymous.base.app;

public class Test1 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.study();

        //当只使用对象中的某个方法一次时：使用匿名对象
        new Student().study();

    }
}
