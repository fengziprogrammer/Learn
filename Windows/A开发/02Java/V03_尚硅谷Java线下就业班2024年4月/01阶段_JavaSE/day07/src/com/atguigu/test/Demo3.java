package com.atguigu.test;

public class Demo3 {// 主类  测试类

    public static void main(String[] args) {
        // 创建一个学生类
        Student student = new Student();

        // 使用一个类
        // 成员变量用来使用属性值/属性值进行赋值
        // 成员方法 用来调用功能
        student.name = "李四";
        System.out.println(student.name);

        // 需求 将学生的age的值 变成 88
        student.age = 88;
        // student.age; // 报错 需要有操作
        System.out.println(student.age);

        // 需求 使用学生类的学习功能
        student.study();
    }
}

/*
定义一个学生类
    属性:姓名,年龄
    功能:学习,吃饭,睡觉
 */
class Student{// 基本类 数据类 bean类

    // 属性:姓名,年龄 (成员变量  类中方法外)
    String name = "张三";
    int age = 23;

    // 功能:学习,吃饭,睡觉  定义成员方法时  推荐不使用static
    public  void study(){
        System.out.println("学生具有学习的功能");
    }

    public  void eat(){
        System.out.println("学生具有吃饭的功能");
    }

    public  void sleep(){
        System.out.println("学生具有睡觉的功能");
    }

}
