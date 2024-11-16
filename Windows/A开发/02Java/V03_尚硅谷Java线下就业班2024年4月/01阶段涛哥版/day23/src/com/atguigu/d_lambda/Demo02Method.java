package com.atguigu.d_lambda;

import java.util.function.Supplier;

public class Demo02Method {
    public static void main(String[] args) {
        method(new Supplier<String>() {
            /*
               get为重写方法:无参的,返回值为String的

               trim方法在get中:无参的,返回值为String的

               考虑用方法引用
             */
            @Override
            public String get() {
                return " abcd  ".trim();
            }
        });

        System.out.println("===================");

        method(()-> " abcd  ".trim());

        System.out.println("=========方法引用==========");

        method(" abcd  "::trim);

        System.out.println("===========================");


        method(new Supplier<String>() {
            /*
              get():空参,返回值类型为String
              toUpperCase:空参,返回值类型为String
             */
            @Override
            public String get() {
                return "abcdefg".toUpperCase();
            }
        });
        System.out.println("================");
        method(()->"abcdefg".toUpperCase());
        System.out.println("======方法引用=======");
        method("abcdefg"::toUpperCase);

        System.out.println("=======================");

        method(()->"abcdefg".substring(1));

        //method("abcdefg"::substring);

    }

    public static void method(Supplier<String> supplier){
        String s = supplier.get();
        System.out.println(s);
    }
}
