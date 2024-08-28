package com.itheima.string;

public class StringDemo1 {
    /*
    已知字符串，完成需求
    String str = "I Love Java, I Love Heima";
    判断是否存在  “Java”
    判断是否以Heima字符串结尾
    判断是否以Java开头
    判断 Java在字符串中的第一次出现位置
    判断  itcast 所在的位置
    */
    public static void main(String[] args) {
        String str = "I Love Java, I Love Heima";

        boolean result = str.contains("Java");
        System.out.println(result);

        boolean result2 = str.endsWith("Heima");
        System.out.println(result2);

        boolean result3 = str.startsWith("Java");
        System.out.println(result3);

        int index = str.indexOf("Java");
        System.out.println(index);

        int itcast = str.indexOf("itcast");
        System.out.println(itcast);

    }
}
