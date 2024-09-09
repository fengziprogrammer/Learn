package com.itheima.api_demo.integer_demo;
/*
    将字符串"1111" 转换为int类型的数据，
    然后乘以2，把结果转换为字符串打印到控制台
 */
public class Test1 {
    public static void main(String[] args) {
        String s = "1111";

        int i = Integer.parseInt(s);

//        String newStr = i * 2 + "";
        String newStr = String.valueOf(i * 2) ;
        System.out.println(newStr);


    }
}
