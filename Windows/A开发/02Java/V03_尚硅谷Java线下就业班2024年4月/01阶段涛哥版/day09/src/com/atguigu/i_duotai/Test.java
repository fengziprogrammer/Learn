package com.atguigu.i_duotai;

public class Test {
    public static void main(String[] args) {
        //多态方式
        Fu fu = new Zi();
        System.out.println(fu.num);//父类的100
        fu.method();

        System.out.println("============");

        //原始方式
        Zi zi = new Zi();
        System.out.println(zi.num);//子类的10
        zi.method();
    }
}
