package com.itheima.homework.test5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    1. 定义一个：键Integer，值String类型的HashMap集合
    2. 存储以下数据：”张三” ,“李四”,“王五”。（put）
    3. 打印集合大小；
    4. 使用“键找值”的方式遍历集合，打印键和值；(keySet)
    5. 使用“键值对”的方式遍历集合，打印键和值；(entrySet)
    6. 获取键为1的值，并打印(get)
    7. 获取键为10的值，并打印
    8. 判断集合中是否有键：10（containsKey）
    9. 删除键为1的键值对，删除完毕打印集合
 */
public class Test5 {
    public static void main(String[] args) {
        // 1. 定义一个：键Integer，值String类型的HashMap集合
        HashMap<Integer, String> hm = new HashMap<>();
        // 2. 存储以下数据：”张三” ,“李四”,“王五”。（put）
        hm.put(0, "张三");
        hm.put(1, "李四");
        hm.put(2, "王五");
        // 3. 打印集合大小；
        System.out.println(hm.size());

        System.out.println("===================");

        // 4. 使用“键找值”的方式遍历集合，打印键和值；(keySet)
        Set<Integer> set = hm.keySet();
        for (Integer key : set) {
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }

        System.out.println("===================");

        // 5. 使用“键值对”的方式遍历集合，打印键和值；(entrySet)
        Set<Map.Entry<Integer, String>> set2 = hm.entrySet();
        for (Map.Entry<Integer, String> entry : set2) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);
        }

        System.out.println("===================");

        // 6. 获取键为1的值，并打印(get)
        System.out.println(hm.get(1));

        System.out.println("===================");

        // 7. 获取键为10的值，并打印
        System.out.println(hm.get(10));

        System.out.println("===================");

        // 8. 判断集合中是否有键：10（containsKey）
        System.out.println(hm.containsKey(10));

        System.out.println("===================");

        // 9. 删除键为1的键值对，删除完毕打印集合
        System.out.println(hm.remove(1));
        System.out.println(hm);
    }
}
