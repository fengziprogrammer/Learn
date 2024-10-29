package com.itheima.stream_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    Stream流中三类方法之一 :  中间方法

    1 Stream<T> filter(Predicate predicate)：用于对流中的数据进行过滤
        Predicate接口中的方法 : boolean test(T t)：对给定的参数进行判断，返回一个布尔值

    2 Stream<T> limit(long maxSize)：截取指定参数个数的数据
    3 Stream<T> skip(long n)：跳过指定参数个数的数据
    4 static <T> Stream<T> concat(Stream a, Stream b)：合并a和b两个流为一个流
    5 Stream<T> distinct()：去除流中重复的元素。依赖(hashCode和equals方法)
    6 Stream<T> sorted () : 将流中元素按照自然排序的规则排序
    7 Stream<T> sorted (Comparator<? super T> comparator) : 将流中元素按照自定义比较器规则排序
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("曹操", "曹孟德", "曹阿瞒", "曹阿瞒", "曹阿瞒", "刘备", "刘玄德", "刘皇叔"));

        // Stream<T> limit(long maxSize)：截取指定参数个数的数据
        list.stream().limit(3).forEach((String s) -> {
            System.out.println(s);
        });

        System.out.println("======================");

        // Stream<T> skip(long n)：跳过指定参数个数的数据
        list.stream().skip(3).forEach((String s) -> {
            System.out.println(s);
        });

        System.out.println("======================");

        //  4 static <T> Stream<T> concat(Stream a, Stream b)：合并a和b两个流为一个流
        Stream.concat(list.stream(), list.stream()).forEach((String s) -> {
            System.out.println(s);
        });

        System.out.println("======================");

        // 5 Stream<T> distinct()：去除流中重复的元素。依赖(hashCode和equals方法)
        list.stream().distinct().forEach((String s) -> {
            System.out.println(s);
        });

        System.out.println("======================");

        //  6 Stream<T> sorted () : 将流中元素按照自然排序的规则排序
        list.stream().sorted().forEach((String s) -> {
            System.out.println(s);
        });

        System.out.println("======================");

        // 7 Stream<T> sorted (Comparator<? super T> comparator) : 将流中元素按照自定义比较器规则排序
        list.stream().sorted((String o1, String o2) -> {
            return -o1.compareTo(o2);
        }).forEach((String s) -> {
            System.out.println(s);
        });
    }

    private static void method(ArrayList<String> list) {
        // Stream<T> filter(Predicate predicate)：用于对流中的数据进行过滤
        // filter方法会遍历stream流,拿到stream中的每一个元素
        // 会把每一个元素传递给形参s , lambda表达式如果返回true表示当前元素留下来 , 如果返回false次元素过滤掉
        list.stream().filter((String s) -> {
            return s.length() == 3;
        }).forEach((String s) -> {
            System.out.println(s);
        });
    }
}
















