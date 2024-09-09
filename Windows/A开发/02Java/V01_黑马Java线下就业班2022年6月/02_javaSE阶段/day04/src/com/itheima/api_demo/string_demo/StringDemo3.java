package com.itheima.api_demo.string_demo;

import java.util.Locale;

/*
    需求2 :
        已知字符串，完成右侧需求
        String str = "I Love Java, I Love Heima";
    需求：
        1 计算字符 a 出现的次数（要求使用toCharArray）
        2 计算字符 a 出现的次数（要求使用charAt）
        3 将字符串中所有英文字母变成小写
        4 将字符串中所有英文字母变成大写
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String str = "I Love Java, I Love Heima";

        //  1 计算字符 a 出现的次数（要求使用toCharArray）
        char[] chs = str.toCharArray(); // {'I' , ' ' , 'l' , 'O' ....}
        int count = 0;
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == 'a') {
                count++;
            }
        }
        System.out.println("字符a出现了" + count + "次");

        // 2 计算字符 a 出现的次数（要求使用charAt）
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a'){
                count2++;
            }
        }
        System.out.println("字符a出现了" + count2 + "次");

        //  3 将字符串中所有英文字母变成小写
        String s = str.toLowerCase();
        System.out.println(s);

        //  4 将字符串中所有英文字母变成大写
        String s1 = str.toUpperCase();
        System.out.println(s1);
    }
}