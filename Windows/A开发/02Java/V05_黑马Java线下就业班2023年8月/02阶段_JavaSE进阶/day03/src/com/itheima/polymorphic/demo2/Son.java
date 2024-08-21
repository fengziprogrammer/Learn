package com.itheima.polymorphic.demo2;

//子类
public class Son extends Father {
    //成员变量（和父类中的一模一样）
    int num = 10;

    //成员方法：和父类一模一样（方法重写）
    public void show() {
        System.out.println("子类的show方法");
    }

    public void show2(){
        System.out.println("子类特有的方法");
    }
}
