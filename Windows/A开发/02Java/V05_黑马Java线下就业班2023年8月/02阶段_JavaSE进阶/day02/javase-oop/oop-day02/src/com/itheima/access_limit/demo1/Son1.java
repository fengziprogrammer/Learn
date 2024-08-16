package com.itheima.access_limit.demo1;

public class Son1 extends Father1{

    public static void main(String[] args) {
        Father1 f1 = new Father1();
        f1.name="黑马";
    }

    public void method(){
        this.name="上海";//同一个包下的父类中修饰默认权限修饰的变量可以访问
    }
}
