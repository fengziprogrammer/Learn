package com.itheima.collection_demo.iterator_demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    如果获取一个Iterator对象
        Iterator it = 单列集合对象.iterator()

    Iterator : 接口 , 迭代器 , 用来遍历单列(Collection)集合
        boolean hasNext() : 判断是否存在下一个元素 , 如果存在返回true
        E next() : 拿到迭代的下一个元素 , 并把指针往后移动一位
        remove() :

    如果获取迭代器对象 : 所有的单列集合中都存在一个 iterator() 方法
 */
public class Demo {
    public static void main(String[] args) {
        // 集合对象
        Collection<String> c = new ArrayList<>();

        // 添加元素
        c.add("貂蝉");
        c.add("小乔");
        c.add("大乔");
        c.add("尚香");
        c.add("甄宓");

        // 遍历集合
        // 获取迭代器对象
        Iterator<String> it = c.iterator();

        //  E next() : 拿到迭代的下一个元素
//        String s = it.next();
//        System.out.println(s);
//        s = it.next();
//        System.out.println(s);
//        s = it.next();
//        System.out.println(s);
//        s = it.next();
//        System.out.println(s);
//        s = it.next();
//        System.out.println(s);

        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        // s = it.next(); // NoSuchElementException
        // System.out.println(s);

    }
}