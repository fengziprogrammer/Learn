package com.itheima.polymorphic_demo;

/*
    多态的成员访问 : 重点!!
        1 成员变量 : 编译看左边(父类) , 执行看左边(父类)
        2 成员方法 : 编译看左边(父类) , 执行看右边(子类)
        3 构造方法 : 和继承一样 , 每个构造方法默认第一行都会有super() 去访问父类的无参构造
 */
public class Test2 {
    public static void main(String[] args) {
        // 多态对象
        Father f = new Son();
        // 多态对象访问成员变量 , 编译时期看父类
        // System.out.println(f.num2);
        // 多态对象访问成员变量 , 编译时期看父类 , 执行看父类
        System.out.println(f.num1);// 10

        // 多态对象访问成员方法 , 编译时期看父类
        // f.method();
        // 多态对象访问成员方法 , 编译时期看父类 , 执行看子类
        f.show();
        f.show2();
    }
}

class Father {
    int num1 = 10;

    public void show() {
        System.out.println("父类中的show方法");
    }

    public void show2(){
        System.out.println("父类的show2方法");
    }
}

class Son extends Father {
    public Son(){
        super();
    }
    int num1 = 100;
    int num2 = 200;

    @Override
    public void show() {
        System.out.println("子类中的show方法");
    }

    public void method() {
        System.out.println("子类中的method方法");
    }
}