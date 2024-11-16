package com.atguigu.d_lambda;

import java.util.function.Supplier;

public class Demo03Method {
    public static void main(String[] args) {
        method(new Supplier<Double>() {
            /*
              get: 无参,返回值类型为Double
              random:无参,返回值类型为double
             */
            @Override
            public Double get() {
                return Math.random();
            }
        });

        System.out.println("======Lambda表达式======");

        method(()-> Math.random());

        System.out.println("======方法引用======");
        method(Math::random);
    }
    public static void method(Supplier<Double> supplier){
        Double s = supplier.get();
        System.out.println(s);
    }
}
