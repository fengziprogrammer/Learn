package com.itheima.regex;
/*
    预定义字符 : 简化字符类的书写
    "."  ：匹配任何字符。
    "\d" ：任何数字[0-9]的简写
    "\D" ：任何非数字[^0-9]的简写
    "\s" ：空白字符：[\t\n\x0B\f\r] 的简写
    "\S" ：非空白字符：[^\s] 的简写
    "\w" ：单词字符：[a-zA-Z_0-9]的简写
    "\W" ：非单词字符：[^\w]

    需求 :
       1 验证str是否3位数字
       2 验证手机号：1开头，第二位：3/5/8，剩下9位都是0-9的数字
       3 验证字符串是否以h开头，以d结尾，中间是任何字符
*/
public class RegexDemo4 {
    public static void main(String[] args) {
        //验证str是否3位数字
        System.out.println("123".matches("\\d\\d\\d"));

        //验证手机号：1开头，第二位：3/5/8，剩下9位都是0-9的数字 ）
        System.out.println("12188888888".matches("1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));

        //验证字符串是否以h开头，以d结尾，中间是任何字符
        System.out.println("had".matches("h.d"));
    }
}
