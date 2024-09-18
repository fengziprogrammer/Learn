package com.atguigu.k_map;

import java.util.Collection;
import java.util.HashMap;

public class Demo01HashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("柳岩","涛哥");
        map.put("曼曼","涛哥");
        map.put("金莲","大郎");
        map.put("黛玉","宝玉");
        map.put("曼曼","大郎");
        map.put(null,null);
        System.out.println(map);

        //V remove(Object key)  ->根据key删除键值对,返回的是被删除的value
        String value = map.remove("黛玉");
        System.out.println(value);
        System.out.println(map);

        // V get(Object key) -> 根据key获取value
        System.out.println(map.get("曼曼"));

        // boolean containsKey(Object key)  -> 判断集合中是否包含指定的key
        System.out.println(map.containsKey("曼曼"));

        //Collection<V> values() -> 获取结合中所有的value,转存到Collection集合中
        Collection<String> collection = map.values();
        System.out.println(collection);

    }
}
