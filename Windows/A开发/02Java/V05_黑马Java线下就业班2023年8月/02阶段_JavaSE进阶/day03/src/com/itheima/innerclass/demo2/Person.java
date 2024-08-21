package com.itheima.innerclass.demo2;

public class Person {
    private String name = "张三";
    int num = 30;//外部类成员变量

    class Heart {
        private int rate;//60~75
        int num = 20;//内部类成员变量

        public void beats() {
            int num = 10;//内部类方法中的局部变量
            System.out.println(num);//10
            System.out.println(this.num);//20
            System.out.println(Person.this.num);//30
        }
    }
}

