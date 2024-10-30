package com.atguigu.i_regex;

import java.util.Arrays;

public class Demo07Regex {
    public static void main(String[] args) {
        String s = "abc dfad  sadfasdf   a";
        String[] arr = s.split(" +");
        System.out.println(Arrays.toString(arr));

        System.out.println("=================");

        //String replaceAll(String regex, String replacement)把满足正则表达式的字符串,替换为新的字符

        String s1 = "abc adfa  sadfads    dfdsa  dsaf";
        String newStr = s1.replaceAll(" +", "z");
        System.out.println("newStr = " + newStr);
    }
}
