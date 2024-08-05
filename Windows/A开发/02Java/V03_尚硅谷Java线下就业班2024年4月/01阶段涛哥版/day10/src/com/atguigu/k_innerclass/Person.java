package com.atguigu.k_innerclass;

public class Person {
    public void method(){
        /**
         * class Heart放到了method方法中
         * 所以Heart就叫做局部内部类
         */
        class Heart{
            public void jump(){
                System.out.println("心一跳,爱就开始煎熬,每一分,每一秒!!!");
            }
        }

        new Heart().jump();
    }
}
