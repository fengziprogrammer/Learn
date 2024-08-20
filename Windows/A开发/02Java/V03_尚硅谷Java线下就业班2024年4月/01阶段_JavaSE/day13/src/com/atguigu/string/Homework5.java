package com.atguigu.string;

import java.util.Scanner;

public class Homework5 {

    /*
     需求：把字符串反转
        举例：键盘录入"abc"
        输出结果："cba"
        分析
            1> 键盘录入对象 sc
            2> 定义一个空字符串  str ""
            3> 通过sc 获取字符串数据 line
            4> 遍历 line  获取每一个字符 ch -->结合fori-- 以及 charAt(i)  获取每一个元素
            5> 使用str 拼接 ch

     */
    public static void main(String[] args) {

        // 1> 键盘录入对象 sc
        Scanner sc = new Scanner(System.in);

        // 2> 定义一个空字符串  str ""
        String str = "";

        // 3> 通过sc 获取字符串数据 line
        System.out.println("请输入一个字符串");
        String line  = sc.nextLine();

        // 4> 遍历 line  获取每一个字符 ch  // fori--  次数  line.length()-1
        for (int i = line.length()-1; i >= 0; i--) {
            str += line.charAt(i);
        }
        // 5> 使用str 拼接 ch
        System.out.println(str);

    }
}
