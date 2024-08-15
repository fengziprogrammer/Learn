package com.atguigu.e_string;

import java.util.Scanner;

public class Demo08Count {
    public static void main(String[] args) {
        //1.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //2.调用next方法,录入一个字符串
        System.out.println("请你输入一个字符串:");
        String data = sc.next();
        //3.定义三个变量,分别统计大写字母个数,小写字母个数,数字个数
        //int big = 0;
        //int small = 0;
        //int number = 0;
        int big = 0;
        int small = 0;
        int number = 0;

        //4.遍历字符串,将每一个字符获取出来
        char[] chars = data.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char num = chars[i];
        //5.判断字符是否为大写字母,小写字母,数字
        /*a.判断大写字母-> 比如B
        A-Z ASCII码值 -> 65-90
        B 的ASCII码值 -> 66 -> 在65-90范围内的
        big++*/
            if (num>='A' && num<='Z'){
                big++;
            }

        /*b.判断小写字母 -> 比如 b
        a-z 的ascii码值 -> 97-122
        b的ascii码值 -> 98 -> 在97-122范围内的
        small++*/
            if (num>='a' && num<='z'){
                small++;
            }

       /* c.判断数字 -> 比如2
        字符0-字符9的ascii码值 -> 48-57
        字符2的ascii码值 -> 50 -> 在48-57之间
        number++*/
            if (num>='0' && num<='9'){
                number++;
            }

        }

        //6.输出三个变量
        System.out.println("大写字母个数为:"+big+"个");
        System.out.println("小写字母个数为:"+small+"个");
        System.out.println("数字个数为:"+number+"个");
    }
}
