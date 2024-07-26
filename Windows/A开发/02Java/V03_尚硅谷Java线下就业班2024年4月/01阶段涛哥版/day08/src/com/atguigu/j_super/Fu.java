package com.atguigu.j_super;

public class Fu {
    int num = 100;
    public Fu(){
        System.out.println("我是父类中的无参构造");
    }

    public Fu(int i){
        System.out.println("我是父类中的有参构造");
    }

    public void method(){
        System.out.println("我是父类中的method方法");
    }
}
