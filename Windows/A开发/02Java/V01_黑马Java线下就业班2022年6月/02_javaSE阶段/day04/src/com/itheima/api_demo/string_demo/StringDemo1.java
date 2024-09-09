package com.itheima.api_demo.string_demo;
/*
        已知字符串，完成需求
        String str = "I Love Java, I Love Heima";

        判断是否存在  “Java”
        判断是否以Heima字符串结尾
        判断是否以Java开头
        判断 Java在字符串中的第一次出现位置
        判断 itcast 所在的位置

 */
public class StringDemo1 {
    public static void main(String[] args) {
        String str = "I Love Java, I Love Java Heima";

        //  判断是否存在  “Java”
        System.out.println(str.contains("Java"));

        // 判断是否以Heima字符串结尾
        System.out.println(str.endsWith("Heima"));

        // 判断是否以Java开头
        System.out.println(str.startsWith("Java"));

        //  判断 Java在字符串中的第一次出现位置
        System.out.println(str.indexOf("IOS"));

        // 判断 Java 最后出现的的位置
        System.out.println(str.lastIndexOf("Java"));

    }
}