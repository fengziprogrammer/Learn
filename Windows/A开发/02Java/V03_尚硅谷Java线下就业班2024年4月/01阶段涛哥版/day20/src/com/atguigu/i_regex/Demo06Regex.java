package com.atguigu.i_regex;

public class Demo06Regex {
    public static void main(String[] args) {
        //校验字符串abc可以出现任意次
        boolean result01 = "abcabcabca".matches("(abc)*");
        System.out.println("result01 = " + result01);
    }
}
