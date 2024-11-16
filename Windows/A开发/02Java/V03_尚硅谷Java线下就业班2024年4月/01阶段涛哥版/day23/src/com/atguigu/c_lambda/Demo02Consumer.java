package com.atguigu.c_lambda;

import java.util.function.Consumer;

public class Demo02Consumer {
    public static void main(String[] args) {
        method(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        },"abcdefg");

        System.out.println("=====Lambda表达式=====");
        method((String s)->{
                System.out.println(s.length());
        },"abcdefg");

        System.out.println("========Lambda表达式终极写法=======");
        method(s-> System.out.println(s.length()),"abcdefg");

    }

    public static void method(Consumer<String> consumer,String s){
        consumer.accept(s);
    }
}
