package com.atguigu.test;

public class Demo2 {

    /*
    多态下成员访问特点
        编译
            编译时如果父类存在该成员,编译通过,否则,编译不通过
        运行
            成员变量(没有多态一说)
                运行的结果是 父类的
            成员方法(动态绑定)
                运行的结果是 子类的
     */
    public static void main(String[] args) {
            // 父类引用指向子类对象
        Father fu = new Son();
        // System.out.println(fu.num2);// 编译时如果父类存在该成员,编译通过,否则,编译不通过
        // fu.method2();// 编译时如果父类存在该成员,编译通过,否则,编译不通过

        System.out.println(fu.num1);//10
        fu.method();//
    }
}

class Father{
    int num1 = 10;
    public void method(){
        System.out.println("---fu-----method");
    }
}

class Son extends  Father{

    int num1 = 20;
    int num2 = 88;
    public void method(){
        System.out.println("---Son-----method");
    }
    public void method2(){
        System.out.println("---Son-----method2");
    }
}
