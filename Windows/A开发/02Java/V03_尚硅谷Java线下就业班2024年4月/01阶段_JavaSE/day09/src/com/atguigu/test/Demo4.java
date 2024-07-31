package com.atguigu.test;


public class Demo4 {

    /*
        真实开发过程中多态的应用
            多态的现象 大多都是被动形成
        多态弊端
            不能访问子类特有的成员


        方法形参  尽可能使用父类  可以接受它的任意子类对象
        方法返回值类型  尽可能使用父类  返回可以返回它的任意子类
     */
    public static void main(String[] args) {



    }


}

class ClassAA{
    int num1 = 10;
    int num3= 88;

    public void method(){
        System.out.println("------fu------method");
    }

}

class ClassBB extends  ClassAA{
    int num1 = 66;
    int num2 = 20;

    public void method(){
        System.out.println("------zi------method");
    }

    public void show(){
        System.out.println(this.num2);
        System.out.println(this.num3);

        method();
    }
}

