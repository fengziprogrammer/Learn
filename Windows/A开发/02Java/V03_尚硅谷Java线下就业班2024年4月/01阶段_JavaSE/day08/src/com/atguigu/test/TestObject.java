package com.atguigu.test;

import com.atguigu.bean.Student;

public class TestObject {

    /*
    一般情况下,一个类的toString功能具体实现是:希望访问对象对应的属性值
    默认情况下 Object  格式  全类名@地址值
    一般要重写

    System.out.println() 自动的调用 参数的toString()
     System.out.println() 内部参数是调用一个方法,则该方法必须要有返回值,否则报错
     */
    public static void main(String[] args) {
       /* Student student = new Student();
        System.out.println(student);
        System.out.println(student.toString());
        System.out.println("---------------");

        Student student2 = new Student("张三",23);
        System.out.println(student2);*/

        // System.out.println(getSum(3, 5));
    }

    public static void getSum(int a ,int b){
        // return  a + b;
    }
}
