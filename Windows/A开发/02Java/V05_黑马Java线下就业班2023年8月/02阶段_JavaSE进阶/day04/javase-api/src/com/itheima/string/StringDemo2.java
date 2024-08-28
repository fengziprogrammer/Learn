package com.itheima.string;


public class StringDemo2 {
    /*
    已知字符串，完成右侧需求
    String str = "I Love Java, I Love Heima";
    需求：
    1.将所有 Love 替换为 Like ,打印替换后的新字符串
    2.截取字符串 "I Love Heima"
    3.截取字符串 "Java"
    */
    public static void main(String[] args) {
        String str = "I Love Java, I Love Heima";

        String replace = str.replace("Love", "like");
        System.out.println(replace);

        String substring = str.substring(13);
        System.out.println(substring);

        System.out.println(str.substring(7,11));
    }
}
