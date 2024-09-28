package com.itheima.map_demo.map_test;

import java.util.LinkedHashMap;
import java.util.Set;

/*
    LinkedHashMap类 , 在最底层采用的数据结构 : 是链表 + 哈希表。
    特点 :
        1 元素键唯一
        2 有序

    需求 : 创建LinkedHashMap对象 , 添加元素进行验证 元素唯一 , 有序的特点
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        // 创建map集合对象
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        // 11, "赵六" , 33, "李四" , 22, "王五"

        hm.put(11, "张三");
        hm.put(11, "张三");
        hm.put(33, "李四");
        hm.put(11, "赵六");
        hm.put(22, "王五");

        Set<Integer> set = hm.keySet();
        for (Integer key : set) {
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
