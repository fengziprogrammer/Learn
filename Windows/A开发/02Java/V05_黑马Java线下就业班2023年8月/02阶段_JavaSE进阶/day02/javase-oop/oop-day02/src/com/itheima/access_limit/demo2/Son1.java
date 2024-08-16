package com.itheima.access_limit.demo2;

import com.itheima.access_limit.demo1.Father1;

public class Son1 extends Father1 {

    public static void main(String[] args) {
        //创建Father1对象
        Father1 f1 = new Father1();
        //f1.name="错误"; //无法访问不同包下的使用：默认权限修饰的变量

       //创建Son1对象
        Son1 s1 = new Son1();
        //s1.name=""; //Son1无法继承Father1类中使用：默认权限修饰的变量
    }
}
