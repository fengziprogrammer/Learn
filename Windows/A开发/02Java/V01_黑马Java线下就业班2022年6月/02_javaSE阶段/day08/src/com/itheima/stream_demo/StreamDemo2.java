package com.itheima.stream_demo;

import java.util.*;
import java.util.stream.Stream;

/*
    Stream流中三类方法之一 :  获取方法

        1 单列集合
            可以使用Collection接口中的默认方法stream()生成流
            default Stream<E> stream()
        2 双列集合
            双列集合不能直接获取 , 需要间接的生成流
            可以先通过keySet或者entrySet获取一个Set集合，再获取Stream流
        3 数组
            Arrays中的静态方法stream生成流

        4 把同一种数据类型多个数据放到stream
            Stream类中的of方法 , 把多个数据放在stream流上
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("关平", "张苞", "刘禅", "关凤"));
        // Collections.addAll(list, "关平", "张苞", "刘禅", "关凤");

        // 可以使用Collection接口中的默认方法stream()生成流
        // default Stream<E> stream()
        list.stream().forEach((String s) -> {
            System.out.println(s);
        });

        System.out.println("==================");

        HashMap<String, String> map = new HashMap<>(Map.of("it001", "张三", "it002", "李四", "it003", "王五"));

        // 双列集合不能直接获取 , 需要间接的生成流
        // 可以先通过keySet或者entrySet获取一个Set集合，再获取Stream流
        Set<String> set = map.keySet();
        set.stream().forEach((String key) -> {
            System.out.println(key + "--" + map.get(key));
        });

        Set<Map.Entry<String, String>> set2 = map.entrySet();
        set2.stream().forEach((Map.Entry<String, String> entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

        System.out.println("==================");

        // Arrays中的静态方法stream生成流
        String[] str = {"曹昂", "曹丕", "曹植", "曹冲", "曹熊"};
        Arrays.stream(str).forEach((String s) -> {
            System.out.println(s);
        });

        System.out.println("==================");

        // 把多个用一种数据类型多个值 放入Stream上
        Stream.of(1, 2, 3, 4, 5, 6, 7).forEach((Integer i) -> {
            System.out.println(i);
        });
    }
}

