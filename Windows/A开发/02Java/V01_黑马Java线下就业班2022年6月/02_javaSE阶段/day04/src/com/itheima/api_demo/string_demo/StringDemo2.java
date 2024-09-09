package com.itheima.api_demo.string_demo;
/*
        需求1 :
        已知字符串，完成右侧需求
        String str = "I Love Java, I Love Heima";

        需求：
        1.将所有 Love 替换为 Like ,打印替换后的新字符串
        2.截取字符串 "I Love Heima"
        3.截取字符串 "Java"
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String str = "I Love Java, I Love Heima";

        //  1.将所有 Love 替换为 Like ,打印替换后的新字符串
        String replaceStr = str.replace("Love", "Like");
        System.out.println(replaceStr);

        String s = str.replaceFirst("Love", "Like");
        System.out.println(s);

        // 只能替换字符串
        String s1 = str.replaceAll("Love", "Like");
        System.out.println(s1);


        //  2.截取字符串 "I Love Heima"
        String substringStr = str.substring(13);
        System.out.println(substringStr);

        //  3.截取字符串 "Java"
        String substring = str.substring(7, 11);
        System.out.println(substring);
    }
}