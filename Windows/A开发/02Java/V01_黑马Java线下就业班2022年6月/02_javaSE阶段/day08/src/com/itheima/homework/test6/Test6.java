package com.itheima.homework.test6;

import java.util.HashMap;

/*
    有以下字符串：

    String str = “fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew”;

    请编程统计每个字符出现的次数
 */
public class Test6 {
    public static void main(String[] args) {
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        // 键存储字符, 值存储字符出现的次数
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            // 拿到字符串中每一个字符
            char ch = str.charAt(i);
            // 存在键为此字符
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {// 不存在
                hm.put(ch, 1);
            }
        }

        System.out.println(hm);
    }
}
