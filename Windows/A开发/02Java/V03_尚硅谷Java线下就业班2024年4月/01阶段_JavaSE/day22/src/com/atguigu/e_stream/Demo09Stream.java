package com.atguigu.e_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo09Stream {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三", "李四", "王五", "赵六", "田七", "猪八");
        List<String> list = stream1.collect(Collectors.toList());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
