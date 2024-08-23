package com.itheima.code_block.constructor_demo;

/*
    构造代码块 :
        1 定义格式 :  在类中方法外 一对大括号
        2 执行时机 :  在每个构造方法执行前先执行构造代码块
        3 作用     :  抽取构造方法中共性内容


        构造代码块执行...
        空参构造方法

        构造代码块执行...
        有参构造方法
 */
public class Student {
    final int NUMBER;

    // 构造代码块
    {
        NUMBER = 10;
        System.out.println("构造代码块执行...");
    }

    public Student() {
        //NUMBER = 10;
        System.out.println("空参构造方法");
    }

    public Student(int a) {
        //NUMBER = 10;
        System.out.println("有参构造方法");
    }
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("==================");
        Student s2 = new Student(10);
    }
}