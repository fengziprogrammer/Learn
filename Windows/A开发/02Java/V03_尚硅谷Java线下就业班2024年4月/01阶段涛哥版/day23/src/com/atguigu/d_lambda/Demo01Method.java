package com.atguigu.d_lambda;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo01Method {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("曼曼", "三上", "金莲", "松下", "有菜", "井上");
        /*
           accept是重写方法:  参数类型为String
                            没有返回值

           想引用println:   println参数类型为String,被引用的方法操作重写方法的参数值
                           没有返回值
         */

        /*stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        stream.forEach(System.out::println);
    }
}
