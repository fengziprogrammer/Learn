package com.atguigu.test;

public class Demo5 {

    /*
    静态关键字（static）
        1.加载时机: 随着类的加载而加载  (静态的只能访问静态/静态的不能访问非静态)
        2.优先于对象产生
        3.被所有的对象所共享
        4.增加了成员的一种访问方式(对象名,属性名/对象名.方法名)
            类名.成员名


        成员变量
            没有使用static 的成员  非静态成员  实例成员(归属于实例)
            使用 static  静态成员  类成员(归属于类)
     */
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 23;
        Student.age = 66;
        // Student.name = "aa";
        stu1.sex = "男";
        System.out.println(stu1);
        stu1.eat();
        stu1.sleep();

        Student stu2 = new Student();
        stu2.name = "李四";
        // stu2.age = 24;
        stu2.sex = "女";
        System.out.println(stu2);//?
        System.out.println(stu1);//?

        System.out.println("-------------");
        Student.eat();
        // Student.sleep();
        stu2.eat();

        // method2();//? 静态的只能访问静态的
        method1();
    }

    public static void method1(){

    }

    public void method2(){

    }
}

class Student{
    String name;
    static int age;
    String sex;

    public static  void eat(){
        System.out.println("--------eat");
    }

    public void sleep(){
        System.out.println("--------sleep");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}


