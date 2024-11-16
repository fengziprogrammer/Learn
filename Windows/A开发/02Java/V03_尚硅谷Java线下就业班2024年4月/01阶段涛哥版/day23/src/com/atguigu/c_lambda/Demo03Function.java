package com.atguigu.c_lambda;

import java.util.function.Function;

public class Demo03Function {
    public static void main(String[] args) {
        method(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        },100);

        System.out.println("=======Lamba=======");

        method(integer -> integer+"",200);
    }

    public static void method(Function<Integer,String> function,Integer number){
        String result = function.apply(number);
        System.out.println("result = " + result+1);
    }
}
