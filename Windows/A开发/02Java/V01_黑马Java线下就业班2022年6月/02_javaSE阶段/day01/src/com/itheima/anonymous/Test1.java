package com.itheima.anonymous;
/*
    匿名对象 : 没有名字的对象,叫做匿名对象

    使用方式 :
        1 直接调用方法
        2 作为方法的参数传递  !!!
        3 作为方法的返回值    !!!

     一般一个对象使用一次 , 那么我们可以使用匿名对象 !

    注意 :
         1 方法的参数是一个类 , 那么调用此方法需要传入此类的对象
         2 方法的返回值类型是一个类 , 那么此方法需要返回此类的对象
 */
public class Test1 {
    public static void main(String[] args) {
        // 有名对象
        Student s1 = new Student();

        // 匿名对象
        new Student();

        // 1 直接调用方法
        new Student().show();

        // 2 作为方法的参数传递  !!!
        userStudent(new Student());
    }

    // 方法的参数如果是一个类 , 那么调用此方法需要传入此类的对象
    public static void userStudent(Student s){

    }

    // 方法的返回值类型是一个类 , 那么需要返回此类的对象
    public static Student getStudent(){
        // 3 作为方法的返回值    !!!
        return new Student();
    }
}

class Student{
    public void show(){
        System.out.println("学生类中的show方法...");
    }
}











