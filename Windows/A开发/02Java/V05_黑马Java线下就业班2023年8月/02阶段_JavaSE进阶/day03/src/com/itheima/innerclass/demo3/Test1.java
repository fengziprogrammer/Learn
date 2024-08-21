package com.itheima.innerclass.demo3;

public class Test1 {
    public static void main(String[] args) {
        //使用匿名内部类，创建Flyable的子类对象
        new Flyable(){
            @Override
            public void fly() {
                System.out.println("我在黑马玩代码");
            }
        }.fly();
    }
}
