package com.atguigu.e_stream;

import java.util.stream.Stream;

public class Demo07Stream {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三", "李四", "王五", "赵六", "田七", "猪八");
        stream1.skip(2).forEach(s -> System.out.println(s));
    }
}
