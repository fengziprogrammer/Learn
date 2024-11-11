package com.atguigu.e_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo02Stream {
    public static void main(String[] args) {
        //1.针对数组:Stream中的方法:
        //static <T> Stream<T> of(T... values)
        Stream<String> stream1 = Stream.of("张三", "李四", "王五", "赵六", "田七", "猪八");
        System.out.println(stream1);
        //2.针对集合:Collection接口中的方法:
        //default Stream<E> stream()
        List<String> list = Arrays.asList("樱木花道", "流川枫", "三井寿", "宫城良田", "赤木刚宪");
        Stream<String> stream2 = list.stream();
        System.out.println(stream2);
    }
}
