package com.atguigu.string;

public class Homework4 {

    /*
    需求：把一个字符串的首字母转成大写，其余为小写。(需求只考虑英文大小写字母字符)
	例:woaisaraHHahaaaa
	    分析
	        1> 定义字符串  "woaisaraHHahaaaa"  str1
	        2> str -> 全部小写 str2  "woaisarahhahaaaa"  截取除首字母外 str22 "oaisarahhahaaaa"
	        3> 获取str的首字母 --> 大写 str3("W")
	        4> 拼接 str3 与 str22  "Woaisarahhahaaaa"
     */
    public static void main(String[] args) {

        // 1> 定义字符串  "woaisaraHHahaaaa"  str1
        String str1 = "woaisaraHHahaaaa";

        // 2> str1 -> 全部小写 str2
        String str2 = str1.toLowerCase();
        String str22 = str2.substring(1);

        // 3> 获取str的首字母 --> 大写 str3
        String str3 = str1.substring(0, 1).toUpperCase();

        // 4> 拼接 str3 与 str2
        String str4 = str3.concat(str22);
        System.out.println("str4 = " + str4);


        // 代码优化    如果一个方法的返回值是一个类类型 ,继续调用方法,产生的中间变量后续又不需要继续使用
        // 链式编程
        String str5 = str1.substring(0, 1)
                .toUpperCase()
                .concat(str1.substring(1).toLowerCase());
        System.out.println(str5);

    }
}
