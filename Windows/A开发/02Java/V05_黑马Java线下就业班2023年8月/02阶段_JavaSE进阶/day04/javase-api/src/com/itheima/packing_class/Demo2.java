package com.itheima.packing_class;

public class Demo2 {
    public static void main(String[] args) {
        //把字符串转换为int类型数据
        String str="123AAA";//字符串不是纯数字

        //在把字符串转换为对应的基本类型数据时，务必保证字符串符合基本类型数据的格式
        int num = Integer.parseInt(str);//出现异常：NumberFormatException
        System.out.println(num);


    }
}
