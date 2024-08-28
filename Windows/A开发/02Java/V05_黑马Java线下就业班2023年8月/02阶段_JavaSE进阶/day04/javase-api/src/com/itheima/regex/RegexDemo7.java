package com.itheima.regex;

import java.util.Arrays;

/*

    1 字符串中常用含有正则表达式的方法
        public String[] split ( String regex ) 可以将当前字符串中匹配regex正则表达式的符号作为"分隔符"来切割字符串。
        public String replaceAll ( String regex , String newStr ) 可以将当前字符串中匹配regex正则表达式的字符串替换为newStr。

    需求:
        1 将以下字符串按照数字进行切割
        String str1 = "aa123bb234cc909dd";

        2 将下面字符串中的"数字"替换为"*“a
        String str2 = "我卡里有100000元，我告诉你卡的密码是123456，要保密哦";

 */
public class RegexDemo7 {
    public static void main(String[] args) {
        // 1 将以下字符串按照数字进行切割
        String str1 = "aa123bb24cc909dd";
        //通过正则表达式，匹配str1字符串中的数字，按照数字切换字符串
        String[] strs = str1.split("\\d+");

        System.out.println(Arrays.toString(strs));


        // 2 将下面字符串中的"数字"替换为"*“a
        String str2 = "我卡里有10000元，我告诉你卡的密码是123456，要保密哦";
        System.out.println(str2.replaceAll("\\d{3,}", "*"));
    }
}

