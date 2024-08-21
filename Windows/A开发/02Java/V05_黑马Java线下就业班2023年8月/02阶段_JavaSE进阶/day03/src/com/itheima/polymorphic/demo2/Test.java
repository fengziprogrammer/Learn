package com.itheima.polymorphic.demo2;

public class Test {
    public static void main(String[] args) {
        // 父类的引用指向子类的对象
        Father f = new Son();

        // 多态对象调用成员变量（使用父类中的成员变量）
        System.out.println(f.num);//结果：100

        // 多态对新乡调用调用成员方法
        f.show();

        // 多态对象不能调用子类特有的方法
        // f.show2();//（ 多态的弊端：父引用不能调用子类对象中特有的方法 ）
        //通过向下转型，访问子类特有成员方法
        ((Son)f).show2();
    }
}
