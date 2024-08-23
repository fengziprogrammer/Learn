package com.itheima.code_block;
/*
    静态代码块
    构造代码块
    有参构造方法
    构造代码块
    空参构造方法
 */
public class Student {
    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("构造代码块");
    }

    public Student() {
        System.out.println("空参构造方法");
    }

    public Student(int a) {
        System.out.println("有参构造方法");
    }


    public static void main(String[] args) {
        Student s1 = new Student(10);
        Student s2 = new Student();
    }
}
