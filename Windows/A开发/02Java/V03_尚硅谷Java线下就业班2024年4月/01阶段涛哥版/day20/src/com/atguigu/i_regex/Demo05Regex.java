package com.atguigu.i_regex;

public class Demo05Regex {
    public static void main(String[] args) {
        //1.验证字符串是否是三位数字
        boolean result01 = "1111".matches("\\d{3}");
        System.out.println("result01 = " + result01);

        //2.验证手机号:1开头 第二位3 5 8 剩下的9位都是0-9的数字
        boolean result02 = "13838381438".matches("[1][358]\\d{9}");
        System.out.println("result02 = " + result02);

        //3.验证qq号:不能是0开头   都是数字    5-15
        boolean result03 = "1212121".matches("[1-9][0-9]{4,14}");
        System.out.println("result03 = " + result03);
    }
}
