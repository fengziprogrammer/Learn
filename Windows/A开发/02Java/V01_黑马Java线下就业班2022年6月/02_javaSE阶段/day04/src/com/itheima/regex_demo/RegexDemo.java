package com.itheima.regex_demo;

/*
    需求 :
        设计程序让用户输入一个QQ号码，验证QQ号的合法性：
        1. QQ号码必须是5--15位长度
        2. 而且必须全部是数字
        3. 而且首位不能为0
 */
public class RegexDemo {
    public static void main(String[] args) {
        System.out.println(checkQQ("456345"));
    }

    public static boolean checkQQ(String qq) {
        return qq.matches("[1-9]\\d{4,14}");
    }

//    public static boolean checkQQ(String qq) {
//        //  1. QQ号码必须是5--15位长度
//        if (qq.length() < 5 || qq.length() > 15) {
//            return false;
//        }
//
//        // 3. 而且首位不能为0
//        if (qq.charAt(0) == '0') {
//            return false;
//        }
//
//        // 2. 而且必须全部是数字
//        for (int i = 0; i < qq.length(); i++) {
//            char ch = qq.charAt(i);
//            // if (!(ch >= '0' && ch <= '9')) {
//            if (ch < '0' || ch > '9') {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
