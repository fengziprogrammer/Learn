package com.atguigu.k_map;

import java.util.HashMap;
import java.util.Set;

public class Demo03HashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("柳岩","涛哥");
        hashMap.put("金莲","大郎");
        hashMap.put("丁一","乔碧萝");
        hashMap.put("锟锟","丁真");

        Set<String> set = hashMap.keySet();
        System.out.println(set);
        for (String key : set) {
            String value = hashMap.get(key);
            System.out.println(key+"..."+value);
        }

    }
}
