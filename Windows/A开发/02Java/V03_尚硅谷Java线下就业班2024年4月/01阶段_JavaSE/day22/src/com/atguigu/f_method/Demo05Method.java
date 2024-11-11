package com.atguigu.f_method;

import java.util.function.Function;

public class Demo05Method {
    public static void main(String[] args) {
       method(new Function<Integer, int[]>() {
           /*
             a.apply有参数,为Integer,有返回值,类型为int[]
             b.将[长度]看成方法参数,有参数,为Integer类型,有返回值为int[]
            */
           @Override
           public int[] apply(Integer integer) {
               return new int[integer];
           }
       },10);

        System.out.println("======Lambda=======");
        method(integer -> new int[integer],100);

        System.out.println("========方法引用========");
        method(int[]::new,1000);
    }
    public static void method(Function<Integer,int[]> function,Integer len){
        int[] arr = function.apply(len);
        System.out.println(arr.length);
    }
}
