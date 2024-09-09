package com.itheima.regex_demo;

import java.util.Arrays;

/*
       1 字符串中常用含有正则表达式的方法
            public String[] split ( String regex ) 可以将当前字符串中匹配regex正则表达式的符号作为"分隔符"来切割字符串。
            public String replaceAll ( String regex , String newStr ) 可以将当前字符串中匹配regex正则表达式的字符串替换为newStr。

    需求:
        1 将以下字符串按照数字进行切割
        String str1 = "aa123bb234cc909dd";

        2 将下面字符串中的"数字"替换为"*“
        String str2 = "我卡里有100000元，我告诉你卡的密码是123456，要保密哦";

 */
public class RegexDemo7 {
    public static void main(String[] args) {
        String str1 = "aa123bb234cc909dd";
        String[] strs = str1.split("\\d+");//{"aa" , "bb" , "cc"  , "dd"}
        System.out.println(Arrays.toString(strs));

//        String s = "aa.bb.cc.dd";
//        String[] strs2 = s.split("\\.");
//        System.out.println(Arrays.toString(strs2));
//        String s = "aa+bb+cc+dd";
//        String[] strs2 = s.split("\\+");
//        System.out.println(Arrays.toString(strs2));

        // 将下面字符串中的"数字"替换为"*“
        String str2 = "我卡里有100000元，我告诉你卡的密码是123456，要保密哦";
        String s = str2.replaceAll("\\d+", "*");
        System.out.println(s);
    }
}
