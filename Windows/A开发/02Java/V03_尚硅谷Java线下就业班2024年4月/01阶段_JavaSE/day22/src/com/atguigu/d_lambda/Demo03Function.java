package com.atguigu.d_lambda;

import java.util.function.Function;

public class Demo03Function {
    public static void main(String[] args) {
        method(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        },100);

        System.out.println("===================");

        method(integer -> integer+"",1000);
    }
    public static void method(Function<Integer,String> function,int i){
        String s = function.apply(i);
        System.out.println("s = " + s);
    }
}
