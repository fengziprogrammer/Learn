package com.itheima.innerclass.demo3;

public class Test2 {
    public static void main(String[] args) {
        //想要调用fly方法：2次
        Flyable f = new Flyable() {
            @Override
            public void fly() {
                System.out.println("我在黑马玩代码");
            }
        };

        f.fly();
        f.fly();
    }
}
