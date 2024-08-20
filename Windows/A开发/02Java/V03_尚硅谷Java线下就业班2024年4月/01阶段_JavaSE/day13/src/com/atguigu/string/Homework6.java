package com.atguigu.string;

public class Homework6 {


    /*
     需求：统计大串中小串出现的次数
 	例如:
	大串为:"woaishangguigu,guiguobutonbao,sfdfobguigdaimao,dguishujiushihguiguomao"
    小串为:"guigu"
        分析
            1> 定义大串s1
            2> 定义一个新字符串 s = 将大串中的小串 替换为 *;
            3> 定义计数器
            4> s -> 数组
            5> 遍历数组 统计*个数
     */
    public static void main(String[] args) {

        // 1> 定义大串s1
        String s1 = "woaishangguigu,guiguobutonbao,sfdfobguigdaimao,dguishujiushihguiguomao";
        String s2 = "guigu";

        // 2> 定义一个新字符串 s = 将大串中的小串 替换为 *;
        String s = s1.replace(s2,"*");

        // 3> 定义计数器
        int count = 0;

        // 4> s -> 数组
        char[] arr = s.toCharArray();

        // 5> 遍历数组 统计*个数
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '*'){
                count++;
            }

        }

        System.out.println(count);

    }
}
