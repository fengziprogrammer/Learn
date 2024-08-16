package com.itheima.static_app.trait;

public class Test2 {
    //测试：静态内容是不需要创建对象，就可以使用了（早于对象创建）
    public static void main(String[] args) {

        System.out.println(StaticDemo.number);

        StaticDemo.method();


        //show(); //静态方法中只能访问静态内容（静态变量、静态方法）


        //静态方法使用场景：工具类
        int a=10;
        int b=20;

        //使用JDK提供的工具类，获取最大值
        int max = Math.max(a, b);
    }

    static int count =1;
    private String name;//非静态成员变量

    //非静态方法
    public void show(){
        System.out.println("show");

        //在非静态方法中，可以访问静态内容
        print();
        count++;
    }

    //静态方法
    public static void print(){
        System.out.println("黑马程序员");

        //静态方法中不能使用this关键字
        //this.name="测试";
    }


}
