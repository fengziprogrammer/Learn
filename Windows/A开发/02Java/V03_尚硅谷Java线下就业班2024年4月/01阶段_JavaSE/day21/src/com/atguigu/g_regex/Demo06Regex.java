package com.atguigu.g_regex;

import java.util.Arrays;

public class Demo06Regex {
    public static void main(String[] args) {
        //String[] split(String regex) 根据给定正则表达式的匹配拆分此字符串。
        String s = "abc haha  heihei   hiah     ia";
        String[] arr = s.split(" +");
        System.out.println(Arrays.toString(arr));
        //String replaceAll(String regex, String replacement)把满足正则表达式的字符串,替换为新的字符
        String s1 = "hadhfa 很大凤凰  是的发送到发    往文件人情味";
        String newStr = s1.replaceAll(" +", "x");
        System.out.println("newStr = " + newStr);
    }
}
