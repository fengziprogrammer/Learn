package com.atguigu.annotation;

import java.util.Date;

public class Demo1 {

    /*
    注解
        格式
            @注解名
        作用
            对程序进行标注和解释(可以被编译器读取)
        常见注解
            @Override   重写
            @Deprecated  过时
     */
    public static void main(String[] args) {
        /*ClassBB classBB = new ClassBB();
        classBB.method2();
        classBB.method3();*/

        Date date = new Date();
        date.getMonth();
    }


}

class ClassAA{

    public  void method1(){
        System.out.println("-----fu----method1");
    }
}

class  ClassBB extends ClassAA{

    // 方法的重写   没有重写的标记  可以进行修改
    public void method2(){
        System.out.println("-----zi----method2");

    }

    // 有重写的标记  不可以进行修改 JVM执行该方法时 去读到了重写的标记,
    @Override //依据重写的语法要求 规范此方法
    public void method1() {
        super.method1();
    }

    @Deprecated  // JVM依据过时的语法要求 规范此方法
    public void method3(){
        System.out.println("-----zi----method3");

    }


}
