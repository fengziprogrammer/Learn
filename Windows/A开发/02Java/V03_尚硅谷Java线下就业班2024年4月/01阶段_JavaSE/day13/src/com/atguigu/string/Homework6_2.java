package com.atguigu.string;

public class Homework6_2 {

    /*
     需求：统计大串中小串出现的次数
        例如:
        大串为:"woaishangguigu,guiguobutonbao,sfdfobguigdaimao,dguishujiushihguiguomao"
        小串为:"guigu"

        s1,s2
        重复的操作: 统计次数,大串的重新赋值
        重复的前提 : 大串中包含小串
     */
    public static void main(String[] args) {

        String  s1 = "woaishangguigu,guiguobutonbao,sfdfobguigdaimao,dguishujiushihguiguomao";
        String s2 = "guigu";
        int count = 0;

        // 重复的前提 : 大串中包含小串
        while(s1.contains(s2)){
            // 重复的操作: 统计次数
            count++;

            // 大串的重新赋值  index = 小串第一次出现在大串的位置 + 小串的长度
            int index = s1.indexOf(s2) + s2.length();
            s1 = s1.substring(index);
        }

        System.out.println(count);


    }
}
