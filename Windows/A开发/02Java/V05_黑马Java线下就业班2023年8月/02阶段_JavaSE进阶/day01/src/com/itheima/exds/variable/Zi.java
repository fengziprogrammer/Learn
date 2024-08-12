package com.itheima.exds.variable;

//子类  继承 父类
public class Zi extends Fu {
    //成员变量（子类）
    int num = 20;

    public void test() {
        //局部变量
        int num = 30;

        System.out.println("局部变量 = " + num);
        System.out.println("本类成员变量 = " + this.num);//this：当前类对象引用
        System.out.println("父类成员变量 = " + super.num);//super：父类对象引用
    }
}
