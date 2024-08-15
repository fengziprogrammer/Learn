package com.atguigu.e_string;

public class Demo10Other {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        //boolean contains(CharSequence s)  -> 判断字符串中是否包含指定串儿
        System.out.println(s1.contains("a"));//true
        System.out.println(s1.contains("ab"));//true
        System.out.println(s1.contains("ac"));//false
        //boolean endsWith(String suffix) -> 判断字符串是否以指定的串儿结尾
        System.out.println(s1.endsWith("g"));//true
        System.out.println(s1.endsWith("fg"));//true
        System.out.println(s1.endsWith("abcdefg"));//true
        System.out.println(s1.endsWith("eg"));//false
        //boolean startsWith(String s) -> 判断字符串是否以指定的串儿开头
        System.out.println(s1.startsWith("a"));//true
        //String toLowerCase() -> 将字符串转成小写
        String s2 = "ADAewqr";
        System.out.println(s2.toLowerCase());
        //String toUpperCase() -> 将字符串转成大写
        System.out.println(s2.toUpperCase());
        //String trim() -> 去掉字符串两端空格(之间空格去不掉)
        String s3 = " adfadsfa  adsfadsf ";
        System.out.println(s3.trim());

        System.out.println("==============================");

        String s4 = " adfa sdfa  dsfas sdaf  ";
        String newStr = s4.replace(" ", "");
        System.out.println(newStr);
    }
}
