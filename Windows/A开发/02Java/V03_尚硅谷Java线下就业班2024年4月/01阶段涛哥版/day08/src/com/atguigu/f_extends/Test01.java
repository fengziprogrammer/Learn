package com.atguigu.f_extends;

public class Test01 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.methodFu();
        //fu.methodZi();//不能调用子类特有的
        fu.method();//父类中的method
        System.out.println("========");
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();
        zi.method();//子类中的method
        System.out.println("===========");

        //Fu fu1 = new Zi();
        //fu1.method();
    }
}
