package com.itheima.string;

public class StringDemo4 {
    /*
    已知字符串，完成右侧需求
    String str = "I Love Java, I Love Heima";
    需求：计算字符 a 出现的次数
    */
    public static void main(String[] args) {

        String str = "I Love Java, I Love Heima";

        String[] strs = str.split("a");//strs={"I Love J" , "v" , ", I Love Heim"}

        System.out.println(strs.length);

    }
}
