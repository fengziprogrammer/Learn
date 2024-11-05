package com.atguigu.g_regex;

public class Demo01Regex {
    public static void main(String[] args) {
        //1.验证字符串是否以h开头,d结尾,中间是aeiou的某一个字符
        boolean result01 = "hyd".matches("[h][aeiou][d]");
        System.out.println("result01 = " + result01);

        System.out.println("=======================");

        //2.验证字符串是否以h开头,d结尾,中间不是aeiou的某一个字符
        boolean result02 = "hyd".matches("[h][^aeiou][d]");
        System.out.println("result02 = " + result02);

        System.out.println("========================");
        //3.验证字符串是否是开头a-z的任意一个小写字母,后面跟ad
        boolean result03 = "had".matches("[a-z][a][d]");
        System.out.println("result03 = " + result03);
    }
}
