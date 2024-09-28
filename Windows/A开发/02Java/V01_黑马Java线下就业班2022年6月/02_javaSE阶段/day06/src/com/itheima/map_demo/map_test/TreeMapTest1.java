package com.itheima.map_demo.map_test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
    需求 :
        定义TreeMap集合存储键值对，
        键使用Integer，值使用String
        存储若干键值对，遍历集合观察结果是否有排序。
 */
public class TreeMapTest1 {
    public static void main(String[] args) {
        // 创建map集合
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(3, "张三");
        tm.put(1, "王五");
        tm.put(3, "赵六");
        tm.put(2, "李四");

        Set<Map.Entry<Integer, String>> set = tm.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);
        }
    }
}