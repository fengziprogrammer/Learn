package com.atguigu.test;


public class Demo1 {

    /*
        多态的前提
        1> 继承
        2> 方法的重写
        3> 父类引用指向子类对象
     */
    public static void main(String[] args) {
        // 父类引用指向子类对象
        Fu fu = new Zi();
        fu.method();

        // fu.method2();
        // System.out.println(fu.num);


    }


}

class Fu{ // 父类
    public void method(){
        System.out.println("--Fu------method");
    }
}

class Zi extends Fu{// 2.方法的重写

    int num ;
    public void method(){
        System.out.println("--Zi------method");
    }

    public void method2(){
        System.out.println("--Zi------method2");
    }
}
