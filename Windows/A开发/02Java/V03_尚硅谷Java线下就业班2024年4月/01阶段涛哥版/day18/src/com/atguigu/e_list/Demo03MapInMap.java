package com.atguigu.e_list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03MapInMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"张三");
        map1.put(2,"李四");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1,"黄晓明");
        map2.put(2,"刘德华");

        HashMap<String, HashMap<Integer, String>> map = new HashMap<>();
        map.put("javase",map1);
        map.put("javaee",map2);

        Set<String> set = map.keySet();
        for (String key : set) {
            HashMap<Integer, String> hashMap = map.get(key);
            Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
            for (Map.Entry<Integer, String> entry : entries) {
                System.out.println(entry.getKey()+"..."+entry.getValue());
            }
        }
    }
}
