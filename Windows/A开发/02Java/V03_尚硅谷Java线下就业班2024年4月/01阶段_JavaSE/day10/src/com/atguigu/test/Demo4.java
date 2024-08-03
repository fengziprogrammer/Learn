package com.atguigu.test;

public class Demo4 {

    public static void main(String[] args) {
        // InterAA interAA = new  InterAA();

        ClassAA classAA = new ClassAA();
        classAA.method1();
        classAA.method3();
        // classAA.method4();

        //InterAA.num1
    }
}

/*
接口的特点
    本质: 提供规则,扩展功能
    特点
        1> 不能实例化
        2> 成员特点
            构造
                没有构造(自己不实现,要求子类实现)
            成员方法
                默认就是抽象方法  默认加上 public abstract
                都是抽象方法(JDK1.8之前)
                JDK1.8之后  出现默认的方法(子类重写,需要去掉default),静态的方法(子类不能继承也不能重写)
                JDK1.9之后 增加了私有方法
            成员变量
                只能是常量  默认修饰符 public static final
     子类实现类的特点
        类与接口的关系   是实现的关系
            子类的特点
                1> 子类是普通类  需要重写父类的全部抽象方法
                   子类是抽象类  可以不重写或者部分重写父类的抽象方法
                2>  子类可以多实现多个接口
                3> 如果一个实现类实现的接口出现了重名的默认方法,该默认方法要求必须重写
                4> 父类的静态方法不能继承也不能重写
        接口与接口的关系   继承
                多继承

 */
interface  InterAA{

    public static final int num1 = 3;
    int num2 = 3;

    // public InterAA(){} //接口没有构造

    // JDK1.8之前
    void method2();
    public abstract void method1();

    // JDK1.8之后  增加了两种定义
    // 允许接口出现了 默认方法(如果子类重写 需要去掉default)  静态方法
    public default void method3(){// 接口默认的方法
        System.out.println("-aaa-------method3");
    }

    public static void method4(){//
        System.out.println("-----static-----method4");
    }


}

interface InterBB{

    void method2();

    public default void method3(){// 接口默认的方法
        System.out.println("-bb-------method3");
    }
}

interface InterCC{}

interface  InterDD extends  InterBB,InterCC{}

class ClassAA implements InterBB,InterAA,InterCC{


    @Override
    public void method2() {
        System.out.println("-----------zi的实现");
    }

    @Override
    public void method3() {
        // InterBB.super.method3();
        System.out.println("-----子的实现-----method3");
    }

    @Override
    public void method1() {

    }


}

abstract  class ClassBB implements InterAA{

    @Override
    public void method1() {

    }
}
