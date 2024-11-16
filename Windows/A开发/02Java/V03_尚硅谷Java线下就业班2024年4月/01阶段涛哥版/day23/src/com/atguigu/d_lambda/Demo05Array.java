package com.atguigu.d_lambda;

import java.util.function.Function;

public class Demo05Array {
    public static void main(String[] args) {
        method(new Function<Integer, int[]>() {
            /*
                apply:参数为Integer型,返回值类型为int[]

                new int[integer]:[integer]看成参数,参数为Integer型
                                 返回值类型为int[]
             */
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        },10);

        System.out.println("===========Lambda表达式=============");

        method(integer-> new int[integer],10);

        System.out.println("===========方法引用============");
        method(int[]::new,10);
    }
    public static void method(Function<Integer,int[]> function,Integer len){
        int[] arr = function.apply(len);
        System.out.println(arr.length);
    }
}
