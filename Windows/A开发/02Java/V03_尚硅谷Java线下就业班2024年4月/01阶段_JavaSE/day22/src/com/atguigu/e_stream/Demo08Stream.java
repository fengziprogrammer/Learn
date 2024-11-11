package com.atguigu.e_stream;

import java.util.stream.Stream;

public class Demo08Stream {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三", "李四", "王五", "赵六", "田七", "猪八");
        Stream<String> stream2 = Stream.of("孙悟空","猪悟能","沙悟净","唐三藏");
        Stream.concat(stream1,stream2).forEach(s -> System.out.println(s));
    }
}
