package com.atguigu.e_stream;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo05Stream {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三", "李四", "王五", "赵六", "田七", "猪八");
        /*stream1.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("赵");
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        System.out.println("================");

        stream1.filter(s -> s.startsWith("赵")).forEach(s -> System.out.println(s));
    }
}
