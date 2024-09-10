package com.atguigu.a_collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        //boolean add(E e) : 将给定的元素添加到当前集合中(我们一般调add时,不用boolean接收,因为add一定会成功)
        collection1.add("刘备");
        collection1.add("刘备");
        collection1.add("关羽");
        collection1.add("张飞");
        collection1.add("诸葛亮");
        collection1.add("庞统");
        System.out.println(collection1);

        System.out.println("=========================");
        //boolean addAll(Collection<? extends E> c) :将另一个集合元素添加到当前集合中 (集合合并)
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("宋江");
        collection2.add("林冲");
        collection2.add("卢俊义");

        collection1.addAll(collection2);

        System.out.println(collection1);

        System.out.println("=========================");
        //void clear():清除集合中所有的元素
        //collection1.clear();
        //System.out.println(collection1);

        System.out.println("=========================");

        //boolean contains(Object o)  :判断当前集合中是否包含指定的元素
        boolean result01 = collection1.contains("刘备");
        System.out.println(result01);

        System.out.println("=========================");

        //boolean isEmpty() : 判断当前集合中是否有元素->判断集合是否为空(指的是元素)
        boolean result02 = collection1.isEmpty();
        System.out.println(result02);

        System.out.println("=========================");

        //boolean remove(Object o):将指定的元素从集合中删除
        collection1.remove("刘备");
        System.out.println(collection1);

        System.out.println("=========================");

        //int size() :返回集合中的元素个数。
        System.out.println(collection1.size());

        System.out.println("=========================");

        //Object[] toArray(): 把集合中的元素,存储到数组中
        Object[] arr = collection1.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
