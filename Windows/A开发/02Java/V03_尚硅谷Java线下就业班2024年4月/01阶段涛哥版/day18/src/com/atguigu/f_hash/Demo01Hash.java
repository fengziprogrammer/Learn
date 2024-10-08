package com.atguigu.f_hash;

import java.util.HashMap;

public class Demo01Hash {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("abc","1");
        hashMap.put("通话","2");
        hashMap.put("重地","3");

        System.out.println("============================");

        HashMap<String, String> hashMap1 = new HashMap<>(10,0.1F);
    }
}
