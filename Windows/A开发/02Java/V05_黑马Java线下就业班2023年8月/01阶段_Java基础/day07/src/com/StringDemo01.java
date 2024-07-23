package com;

/*
    String类构造方法
        1. String(); 空参构造
        2. String(String str); 带参构造
        3. 直接双引号赋值
 */
public class StringDemo01 {
    public static void main(String[] args) {
        //使用双引号直接赋值 -> 简单,常用
        String s1 = "黑马程序员";
        System.out.println(s1); //黑马程序员
        System.out.println(s1.length()); //5

        //String(); 空参构造 -> 不常用,了解即可
        String s2 = new String();
        System.out.println(s2); //

        //String(String str); 带参构造 -> 不常用,了解即可
        String s3 = new String("abc");
        System.out.println(s3); //abc
    }
}
