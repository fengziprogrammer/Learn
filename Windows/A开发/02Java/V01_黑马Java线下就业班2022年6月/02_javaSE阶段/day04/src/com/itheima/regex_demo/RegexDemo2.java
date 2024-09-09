package com.itheima.regex_demo;
/*
    字符类 : 方括号被用于指定字符
    [abc] ：代表a或者b，或者c字符中的一个。
    [^abc]：代表除a,b,c以外的任何字符。
    [a-z] ：代表a-z的所有小写字符中的一个。
    [A-Z] ：代表A-Z的所有大写字符中的一个。
    [0-9] ：代表0-9之间的某一个数字字符。
    [a-zA-Z0-9]：代表a-z或者A-Z或者0-9之间的任意一个字符。
    [a-dm-p]：a 到 d 或 m 到 p之间的任意一个字符

    需求 :
        1 验证str是否以h开头，以d结尾，中间是a,e,i,o,u中某个字符
        2 验证str是否以h开头，以d结尾，中间不是a,e,i,o,u中的某个字符
        3 验证str是否a-z的任何一个小写字符开头，后跟ad
        4 验证str是否以a-d或者m-p之间某个字符开头，后跟ad

        注意: boolean  matches（正则表达式） :如果匹配正则表达式就返回true，否则返回false
        public boolean matches(String regex)

     boolean result = 字符串对象.matches("正则表达式");
     如果字符串对象符合正则表达式的规则返回的结果为true
     如果字符串对象步符合正则表达式的规则返回的结果为false
 */
public class RegexDemo2 {
    public static void main(String[] args) {
//        1 验证str是否以h开头，以d结尾，中间是a,e,i,o,u中某个字符
        String str = "hud";
        System.out.println(str.matches("h[aeiou]d"));

//        2 验证str是否以h开头，以d结尾，中间不是a,e,i,o,u中的某个字符
        System.out.println("hwd".matches("h[^aeiou]d"));

//        3 验证str是否a-z的任何一个小写字符开头，后跟ad
        System.out.println("Bad".matches("[a-z]ad"));

//        4 验证str是否以a-d或者m-p之间某个字符开头，后跟ad
        System.out.println("cad".matches("[a-dm-p]ad"));
    }
}