package com.itheima.stream_demo;

import java.util.ArrayList;
import java.util.List;

/*
    Stream流中三类方法之一 :  终结方法
        1 void forEach(Consumer action)：对此流的每个元素执行操作
            Consumer接口中的方法	void accept(T t)：对给定的参数执行此操作

        2 long count()：返回此流中的元素个数
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("曹操", "曹孟德", "曹阿瞒", "曹阿瞒", "曹阿瞒", "刘备", "刘玄德", "刘皇叔"));

        //  1 void forEach(Consumer action)：对此流的每个元素执行操作
        list.stream().forEach((String s) -> {
            System.out.println(s);
        });

        //  2 long count()：返回此流中的元素个数
        System.out.println(list.stream().count());
    }
}

