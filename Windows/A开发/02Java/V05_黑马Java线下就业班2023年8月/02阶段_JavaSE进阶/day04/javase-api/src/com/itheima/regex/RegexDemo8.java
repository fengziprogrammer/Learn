package com.itheima.regex;

import java.util.Arrays;

public class RegexDemo8 {
    public static void main(String[] args) {
        String str="上海.黑马.程序员";

        //按照：. 切割字符串
        String[] split = str.split("\\.");

        System.out.println(Arrays.toString(split));
    }
}
