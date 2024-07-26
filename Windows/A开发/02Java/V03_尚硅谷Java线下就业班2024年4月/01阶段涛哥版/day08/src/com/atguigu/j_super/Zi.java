package com.atguigu.j_super;

public class Zi extends Fu{
    int num = 10;
    public Zi(){
        super();//调用父类中的无参构造
        //super(10);
        System.out.println("我是子类中的无参构造");
    }

    public Zi(int i){
        super(10);
        System.out.println("我是子类中的有参构造");
    }

    public void method(){
        System.out.println(num);//子类的成员变量
        System.out.println(super.num);//父类的成员变量
        super.method();//调用父类中的method方法
    }
}
