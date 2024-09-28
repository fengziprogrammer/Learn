package com.itheima.map_demo.map_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//import java.util.Map.Entry;

/*
    需求 :  创建Map集合对象 , 往集合中添加以下三对元素
            使用获取Entry对象集合,在找到键和值 遍历集合

            张无忌 -- 赵敏
            张翠山 -- 殷素素
            张三丰 -- 郭襄

    第二种遍历方式 : 获取键值对对象集合 , 在遍历拿到键和值
    Map接口 :
        Set<Map.Entry<K, V>> entrySet() : 返回一个存储entry对象的set集合

    Entry接口 :
        getKey()   : 获取键
        getValue() : 获取值
 */
public class MapDemo3 {
    public static void main(String[] args) {
        // 创建map集合对象
        Map<String, String> map = new HashMap<>();
        // 添加元素
        map.put("张无忌", "赵敏");
        map.put("张翠山", "殷素素");
        map.put("张三丰", "郭襄");

        // Set<Map.Entry<K, V>> entrySet() : 返回一个存储entry对象的set集合
        Set<Map.Entry<String, String>> set = map.entrySet(); // {entry1 , entry2 , entry3}
        // 增强for遍历set
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "..." + value);
        }

        // System.out.println(map);// {张翠山=殷素素, 张三丰=郭襄, 张无忌=赵敏}
    }
}