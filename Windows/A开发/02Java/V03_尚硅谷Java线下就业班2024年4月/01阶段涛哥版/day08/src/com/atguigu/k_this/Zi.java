package com.atguigu.k_this;

public class Zi {
    int num = 100;
    public Zi(){
        this(1);
        System.out.println("我是无参构造");
    }

    public Zi(int i){
        //this();
        System.out.println("我是有参构造");
    }

    public void method(){
        int num = 1000;
        System.out.println(num);//局部的num
        System.out.println(this.num);//成员的num
        //this.method01();
        method01();
    }
    public void method01(){
        System.out.println("method01");
    }
}
