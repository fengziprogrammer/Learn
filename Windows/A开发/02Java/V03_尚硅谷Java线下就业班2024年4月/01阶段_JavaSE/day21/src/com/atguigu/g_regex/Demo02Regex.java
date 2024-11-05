package com.atguigu.g_regex;

public class Demo02Regex {
    public static void main(String[] args) {
        //1.要求字符串是小写a-z的任意字符,并且字符不能以[aeiou]开头,后面跟ad
        boolean result01 = "aad".matches("[[a-z]&&[^aeiou]][a][d]");
        System.out.println("result01 = " + result01);

        System.out.println("================");

        //2.要求字符串是aeiou中的某一个字母开头,后跟ad
        boolean result02 = "had".matches("[a|e|i|o|u][a][d]");
        System.out.println("result02 = " + result02);
    }
}
