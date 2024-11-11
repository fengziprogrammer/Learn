package com.atguigu.e_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo03Stream {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三", "李四", "王五", "赵六", "田七", "猪八");
        /*stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        System.out.println("========Lambda=======");

        stream1.forEach(s -> System.out.println(s));
    }
}
