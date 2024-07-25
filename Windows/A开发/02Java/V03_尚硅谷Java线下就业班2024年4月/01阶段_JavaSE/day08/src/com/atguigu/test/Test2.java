package com.atguigu.test;

public class Test2 {

    /*
        final 修饰符  最终的不可以改变
        修饰类
            不可更改的类  ,不能被继承
        修饰方法
            不可更改的方法,不能被重写
        修饰变量
            不可更改的量 ,变量成为了常量
     */
    public static void main(String[] args) {

        final int NUM = 3;
        // num = 5;
        // System.out.println(num);

        ClassAA classAA = new ClassAA();
        // System.out.println()  内部会自动调用参数的toString()方法
        System.out.println(classAA);
        System.out.println(classAA.toString());

    }
}

class ClassAA{

    int num;

    public final   void method(){

    }

}

class ClassBB extends ClassAA{


    /*public  void method(){

    }*/
}
