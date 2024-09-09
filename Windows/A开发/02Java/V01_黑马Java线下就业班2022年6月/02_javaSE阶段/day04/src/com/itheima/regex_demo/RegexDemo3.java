package com.itheima.regex_demo;

/*
     逻辑运算符 :
        1 && : 并且
        2 |  : 或者

    需求 :
        1 要求字符串是除a、e、i、o、u外的其它小写字符开头，后跟ad
        2 要求字符串是aeiou中的某个字符开头，后跟ad
 */
public class RegexDemo3 {
    public static void main(String[] args) {
//        1 要求字符串是除a、e、i、o、u外的其它小写字符开头，后跟ad
        System.out.println("wad".matches("[a-z&&[^aeiou]]ad"));
//        2 要求字符串是aeiou中的某个字符开头，后跟ad
        System.out.println("wad".matches("[a|e|i|o|u]ad"));
    }
}
