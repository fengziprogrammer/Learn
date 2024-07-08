package com.itheima;

/*
    方法的概述: 一段具有独立功能的代码块, 需要先定义才能调用

    方法定义格式:
        public static void 方法名(){
            方法体;
        }

    方法调用格式:
        方法名();

    方法和方法之间的关系?
        平级关系,所以不能嵌套定义
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        //调用方法
        eat();
        System.out.println("程序结束");
    }

    //定义方法eat
    public static void eat(){
        System.out.println("学生在吃饭...");
        //在eat方法中,简介调用了sleep方法
        sleep();
    }

    //定义方法sleep
    public static void sleep(){
        System.out.println("学生在午休...");
    }
}
