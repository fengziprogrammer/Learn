package com.atguigu.d_lambda;

import java.util.function.Predicate;

public class Demo04Predicate {
    public static void main(String[] args) {
        method(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==7;
            }
        },"abcdefg");
        System.out.println("============lambda========");

        method(s -> s.length()==7,"abcdefg");
    }
    public  static void method(Predicate<String> predicate,String s){
        boolean result = predicate.test(s);
        System.out.println("result = " + result);
    }
}
