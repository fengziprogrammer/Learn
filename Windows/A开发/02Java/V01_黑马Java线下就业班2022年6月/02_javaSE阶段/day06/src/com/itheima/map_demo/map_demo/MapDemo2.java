package com.itheima.map_demo.map_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求 : 创建Map集合对象 , 往集合中添加以下四对元素 , 使用键找值遍历集合

        周瑜 -- 小乔
        孙策 -- 大乔
        刘备 -- 孙尚香
        诸葛亮 -- 黄月英
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // 添加元素
        map.put("周瑜", "小乔");
        map.put("孙策", "大乔");
        map.put("刘备", "孙尚香");
        map.put("诸葛亮", "黄月英");

        // 拿到所有的健集合
        Set<String> set = map.keySet(); // {周瑜 , 孙策 , 刘备 , 诸葛亮}
        // 增强for遍历单列集合set
        for (String key : set) {
            // 根据键找到对应的值
            String value = map.get(key);
            System.out.println(key + "...." + value);
        }
    }
}
