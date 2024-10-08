package com.atguigu.c_hashtable;

import java.util.Hashtable;
import java.util.Set;

public class Demo01Hashtable {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("张无忌","赵敏");
        hashtable.put("张翠山","殷素素");
        hashtable.put("张三丰","郭襄");
        hashtable.put("范瑶","灭绝师太");
        hashtable.put("杨逍","纪晓芙");
        //hashtable.put(null,null);不能存储null键null值
        System.out.println(hashtable);

        Set<String> set = hashtable.keySet();
        for (String key : set) {
            System.out.println(hashtable.get(key));
        }
    }
}
