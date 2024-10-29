package com.itheima.homework.test9;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
    1.利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量
    2.如用户输入字符串:"helloworld java",程序输出结果：h(1)e(1)l(3)o(2) (2)w(1)r(1)d(1)j(1)a(2)v(1)
    3.注：输出结果不要求顺序一致
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();

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

        // System.out.println(hm);
        // 创建sb对象
        StringBuilder sb = new StringBuilder();
        // 获取集合中所有的键
        Set<Character> set = hm.keySet();
        for (Character key : set) {
            Integer value = hm.get(key);
            // 按照指定的格式作拼接
            sb.append(key).append("(").append(value).append(")");
        }

        // 打印sb中内容
        System.out.println(sb);
    }
}
