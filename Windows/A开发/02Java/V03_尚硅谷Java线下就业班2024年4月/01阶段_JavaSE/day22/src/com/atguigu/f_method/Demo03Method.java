package com.atguigu.f_method;

import java.util.function.Supplier;

public class Demo03Method {
    public static void main(String[] args) {
        method(new Supplier<Double>() {
            /*
               a.get方法无参,有返回值,返回值类型为double
               b.random方法无参,有返回值,返回值类型为double

             */
            @Override
            public Double get() {
                return Math.random();
            }
        });
        System.out.println("======Lambda=====");
        method(()->Math.random());

        System.out.println("======方法引用=====");
        method(Math::random);
    }
    public static void method(Supplier<Double> supplier){
        Double aDouble = supplier.get();
        System.out.println("aDouble = " + aDouble);
    }
}
