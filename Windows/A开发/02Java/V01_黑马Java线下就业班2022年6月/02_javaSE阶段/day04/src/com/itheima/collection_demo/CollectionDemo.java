package com.itheima.collection_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
    Collection集合中常用的方法
        public boolean add(E e)：  把给定的对象添加到当前集合中 。
        public void clear() :清空集合中所有的元素。
        public boolean remove(E e): 把给定的对象在当前集合中删除。
        public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
        public boolean isEmpty(): 判断当前集合是否为空。
        public int size(): 返回集合中元素的个数。
        public Object[] toArray(): 把集合中的元素，存储到数组中

   Collection接口 :

   <引用数据类型> : 泛型 , 规范集合中存储元素的类型
   注意 : 泛型中的数据类型必须是引用数据类型
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // 集合中存储的是Object类型的数据
        Collection<String> c = new ArrayList<>();

        // public boolean add(E e)：  把给定的对象添加到当前集合中 。
        c.add("曹操");
        c.add("刘备");
        c.add("孙权");

        // public void clear() :清空集合中所有的元素。
        // c.clear();

        // public boolean remove(E e): 把给定的对象在当前集合中删除。
        // System.out.println(c.remove("刘备"));

        // public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
        // System.out.println(c.contains("孙坚"));

        // public boolean isEmpty(): 判断当前集合是否为空。
        // System.out.println(c.isEmpty());

        // public int size(): 返回集合中元素的个数。
        // System.out.println(c.size());

        // public Object[] toArray(): 把集合中的元素，存储到数组中
        Object[] objects = c.toArray();
        System.out.println(Arrays.toString(objects));

        System.out.println(c);// 打印的集合对象
    }
}