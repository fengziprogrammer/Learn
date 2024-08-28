package com.itheima.string;

public class StringDemo3 {
    /*
    已知字符串，完成右侧需求
    String str = "I Love Java, I Love Heima";
    需求：
    1 计算字符 a 出现的次数（要求使用toCharArray）
    2 计算字符 a 出现的次数（要求使用charAt）
    3 将字符串中所有英文字母变成小写
    4 将字符串中所有英文字母变成大写
    */
    public static void main(String[] args) {
        String str = "I Love Java, I Love Heima";

        int count=0;
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if(chs[i] == 'a'){
                count++;
            }
        }
        System.out.println(count);

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
