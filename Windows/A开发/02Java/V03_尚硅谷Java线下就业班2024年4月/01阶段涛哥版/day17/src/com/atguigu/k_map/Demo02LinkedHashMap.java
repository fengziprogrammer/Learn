package com.atguigu.k_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo02LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("柳岩","涛哥");
        map.put("曼曼","涛哥");
        map.put("金莲","大郎");
        map.put("黛玉","宝玉");
        map.put("曼曼","大郎");
        map.put(null,null);
        System.out.println(map);
    }
}
