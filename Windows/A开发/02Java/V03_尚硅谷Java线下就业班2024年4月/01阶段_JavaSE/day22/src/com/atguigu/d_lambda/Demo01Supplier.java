package com.atguigu.d_lambda;

import java.util.Arrays;
import java.util.function.Supplier;

public class Demo01Supplier {
    public static void main(String[] args) {
        method(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int[] arr = {4,3,5,3,6,7};
                Arrays.sort(arr);
                return arr[arr.length-1];
            }
        });
        System.out.println("=====================");

        method(()->{
                int[] arr = {4,3,5,3,6,7};
                Arrays.sort(arr);
                return arr[arr.length-1];
        });
    }
    public static void method(Supplier<Integer> supplier){
        Integer result = supplier.get();
        System.out.println("result = " + result);
    }
}
