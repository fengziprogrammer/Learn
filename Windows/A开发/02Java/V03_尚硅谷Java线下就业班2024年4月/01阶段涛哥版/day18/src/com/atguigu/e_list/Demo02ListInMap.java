package com.atguigu.e_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02ListInMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"张三");
        map1.put(2,"李四");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1,"黄晓明");
        map2.put(2,"刘德华");

        ArrayList<HashMap<Integer, String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);

        for (HashMap<Integer, String> map : list) {
            Set<Map.Entry<Integer, String>> entries = map.entrySet();
            for (Map.Entry<Integer, String> entry : entries) {
                System.out.println(entry.getKey()+"..."+entry.getValue());
            }
        }
    }
}
