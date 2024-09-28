package com.itheima.map_demo.map_test;

import java.util.HashMap;
import java.util.Set;

/*
    需求： 字符串“aababcabcdabcde”
          请统计字符串中每一个字符出现的次数，并按照以下格式输出
          输出结果：
                    a（5）b（4）c（3）d（2）e（1）

    HashMap<Character , Integer> hm :     key : 存储的是字符  value : 存储的是字符出现的次数
    HashMap的键是唯一的

    "aaba"

    思路 : HashMap<Character , Integer> hm :  { 'a' = 2 , 'b' = 1 }

    'a'
    Map集合中有没有键为此字符
        没有 : 'b' = 1
        出现 : 'a' = 3
 */
public class HashMapTest2 {
    public static void main(String[] args) {
        // 提前准备字符串
        String s = "aababcabcdabcde";

        // 创建集合对象 , 键:字符  值:字符出现的次数
        HashMap<Character, Integer> hm = new HashMap<>();

        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            // 根据索引获取每一个字符
            char ch = s.charAt(i);
            if (hm.containsKey(ch)) {
                // 此字符已经作为键
                hm.put(ch, hm.get(ch) + 1);
            } else {
                // 没有此字符作为键
                hm.put(ch, 1);
            }
        }

        // 把map集合中的元素拼接成指定的格式  a（5）b（4）c（3）d（2）e（1）
        StringBuilder sb = new StringBuilder();
        // 遍历map集合
        Set<Character> set = hm.keySet();
        for (Character key : set) {
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        System.out.println(sb);
    }
}
