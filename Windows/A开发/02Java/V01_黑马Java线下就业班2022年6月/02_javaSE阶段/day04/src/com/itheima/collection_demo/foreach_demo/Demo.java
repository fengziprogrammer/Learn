package com.itheima.collection_demo.foreach_demo;

import java.util.ArrayList;
import java.util.Collection;

/*
    增强for循环 : 可以用来遍历单列集合或者数组 , 底层采用的是迭代器

    格式  :
            for( 集合或者数组中元素的类型  变量名 : 单列集合或者数组){
                变量名就代表的是集合或数组中的每一个元素
            }


    好处 : 简化了单列集合和数组的遍历
    缺点 : 没有索引 , 遍历的目标不能为null

 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {33, 22, 11, 55, 44};

        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("==============");

        Collection<String> c = new ArrayList<>();
        c.add("曹操");
        c.add("刘备");
        c.add("孙权");

        for (String s : c) {
            System.out.println(s);
        }
    }
}
