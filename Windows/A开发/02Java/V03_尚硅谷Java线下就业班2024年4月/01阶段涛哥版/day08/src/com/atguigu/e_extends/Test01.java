package com.atguigu.e_extends;

public class Test01 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);//调用的父类中的成员变量
        //System.out.println(fu.numZi);//不能调用子类特有的成员
        System.out.println(fu.num);//父类中的num
        Zi zi = new Zi();
        System.out.println(zi.numZi);//子类的numZi
        System.out.println(zi.numFu);//从父类中继承过来的
        System.out.println(zi.num);//子类中的num

        System.out.println("=====================");
        //Fu fu1 = new Zi();
        //System.out.println(fu1.num);
    }
}
