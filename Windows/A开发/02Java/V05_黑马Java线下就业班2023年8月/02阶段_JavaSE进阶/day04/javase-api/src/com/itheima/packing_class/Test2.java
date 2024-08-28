package com.itheima.packing_class;

public class Test2 {
    public static void main(String[] args) {
        //String => int
        String str1="123";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);

        //细节：当String中存储的数据不符合要转换的类型，就会出现异常
//        String str2="123A";//A不是数字
//        int num2 = Integer.parseInt(str2);//发生异常：NumberFormatException （数字格式化异常）
//        System.out.println(num2);

        //String => double
        String str3="100.123";
        double num3 = Double.parseDouble(str3);
        System.out.println(num3);
    }
}
