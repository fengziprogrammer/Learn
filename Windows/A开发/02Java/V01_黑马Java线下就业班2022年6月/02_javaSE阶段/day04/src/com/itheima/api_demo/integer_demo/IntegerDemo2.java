package com.itheima.api_demo.integer_demo;
/*
    包装类作用 : 基本数据类型和字符串之间转换

        基本数据类型 --> String
        String --> 基本数据类型

    注意 : parseXxx(String s)方法中只参数用字符串表示, 字符串中只能是具体的数据值
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//
//        System.out.println(Double.MIN_VALUE);
//        System.out.println(Double.MAX_VALUE);

        // 基本数据类型 --> String
        int num = 10;
        String s1 = num + "";
        System.out.println(s1);

        // String类 : public static String valueOf(int i)
        String s2 = String.valueOf(num);
        System.out.println(s2);

        //  String --> 基本数据类型
        // Integer类 : public static int parseInt(String s)
        String s = "213";
        int i = Integer.parseInt(s);
        System.out.println(i + 10);


        String ss = "12.12";
        double d = Double.parseDouble(ss);
        System.out.println(d);
    }
}
