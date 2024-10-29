package com.itheima.exception_demo.exception_test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    定义一个方法接收一个生日日期字符串(xxxx年xx月xx)
    main方法中让用户输入一个生日日期字符串，调用设计好的方法计算在地球上活了多少天。

    要求：如果解析发生异常，捕获异常，提示用户要重新输入生日日期字符串，直到输入正确的日期为止。

    思考：设计代此码的过程中想想什么时候捕获异常，什么时候声明异常？

 */
public class ExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日");

        while (true) {
            String birthday = sc.nextLine();// "2003/03/24"
            try {
                long days = getDays(birthday);
                System.out.println(days);
                break;
            } catch (ParseException e) {
                System.out.println("录入的生日格式有误, 请重新录入...");
            }
        }
    }

    public static long getDays(String birthday) throws ParseException { // birthday = "2003/03/24"
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date d1 = null;
//        try {
//            d1 = sdf.parse(birthday);
//        } catch (ParseException e) {
//            System.out.println("解析字符串发生错误!");
//        }

        Date d1 = sdf.parse(birthday);
        long time1 = d1.getTime();
        long time2 = new Date().getTime();
        return (time2 - time1) / (1000L * 60 * 60 * 24);
    }
}
