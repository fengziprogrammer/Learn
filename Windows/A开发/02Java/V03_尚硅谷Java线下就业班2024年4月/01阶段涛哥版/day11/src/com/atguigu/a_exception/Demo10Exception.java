package com.atguigu.a_exception;

public class Demo10Exception {

}

class Fu{
    public void method(){
        System.out.println("我是父类中的method方法");
    }
}

class Zi extends Fu{
    @Override
    public void method()/*throws Exception*/{
        System.out.println("我是重写后的method方法");
    }
}
