package com.atguigu.k_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo04HashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("柳岩","涛哥");
        hashMap.put("金莲","大郎");
        hashMap.put("丁一","乔碧萝");
        hashMap.put("锟锟","丁真");

        Set<Map.Entry<String, String>> set = hashMap.entrySet();

        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"..."+value);
        }
    }
}
