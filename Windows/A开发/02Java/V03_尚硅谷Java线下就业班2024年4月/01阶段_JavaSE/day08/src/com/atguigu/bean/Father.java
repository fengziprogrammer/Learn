package com.atguigu.bean;

public class Father {

    private void method1(){
        System.out.println("--------Father--private--method");
    }

    void method2(){
        System.out.println("--------Father--缺省--method2");
    }

    protected void method3(){
        System.out.println("--------Father--protected--method3");
    }

    public void method4(){
        System.out.println("--------Father----method4");
    }

}
