package com.atguigu.f_method;

import java.util.function.Supplier;

public class Demo02Method {
    public static void main(String[] args) {
        method(new Supplier<String>() {

              //a.重写get方法无参,有返回值,返回值类型为String
              //b.考虑引用方法toUpperCase无参,有返回值,返回值类型为String

            @Override
            public String get() {
                return "abcdefg".toUpperCase();
            }
        });

        System.out.println("===========Lambda==========");
        method(()->"abcdefg".toUpperCase());

        System.out.println("===========方法引用==========");
        method("abcdefg"::toUpperCase);
    }
    public static void method(Supplier<String> supplier){
        String s = supplier.get();
        System.out.println("s = " + s);
    }
}
