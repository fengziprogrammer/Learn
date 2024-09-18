package com.atguigu.k_map;

import java.util.HashMap;

public class Demo05HashMap {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("柳岩",36),"湖南");
        map.put(new Person("曼曼",45),"辽宁");
        map.put(new Person("涛哥",18),"河北");
        map.put(new Person("涛哥",18),"北京");
        System.out.println(map);
    }
}
