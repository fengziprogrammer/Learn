package com.itheima.stream_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
    Stream流的收集操作 : 第二部分

    使用Stream流的方式操作完毕之后，我想把流中的数据起来，该怎么办呢？

    Stream流的收集方法
    R collect(Collector collector) : 此方法只负责收集流中的数据 , 创建集合添加数据动作需要依赖于参数

    工具类Collectors提供了具体的收集方式
    public static <T> Collector toList()：把元素收集到List集合中
    public static <T> Collector toSet()：把元素收集到Set集合中
    public static  Collector toMap(Function keyMapper,Function valueMapper)：把元素收集到Map集合中

    需求 :
        定义一个集合，并添加一些整数1，2，3，4，5，6，7，8，9，10
        将集合中的奇数删除，只保留偶数。
        遍历集合得到2，4，6，8，10
 */
public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("曹操", "曹孟德", "曹阿瞒", "曹阿瞒", "刘备", "刘玄德", "刘皇叔"));

        // 使用stream流 , 过滤性 曹 三个字的
        //  R collect(Collector collector) : 此方法只负责收集流中的数据 , 创建集合添加数据动作需要依赖于参数
        // collect负责收集元素 , 不负责创建List集合对象
        // 如果需要创建List集合对象需要依赖于Collectors.toList()
        List<String> newList = list.stream().filter((String s) -> {
            return s.startsWith("曹") && s.length() == 3;
        }).collect(Collectors.toList());

        System.out.println(newList);


        System.out.println("===============");

        //   public static <T> Collector toSet()：把元素收集到Set集合中

        Set<String> set = list.stream().filter((String s) -> {
            return s.startsWith("曹") && s.length() == 3;
        }).collect(Collectors.toSet());

        System.out.println(set);

    }

}
