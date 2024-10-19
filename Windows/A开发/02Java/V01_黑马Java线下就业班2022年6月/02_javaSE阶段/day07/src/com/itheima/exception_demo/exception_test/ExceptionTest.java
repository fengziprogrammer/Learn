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
        System.out.println("请输入您的生日:");

        while (true) {
            String birthday = sc.nextLine();
            // 直接调用
            try {
                getDays(birthday);
                break;
            } catch (ParseException e) {
                System.out.println("录入的格式有误, 请重新录入");
            }
        }
    }

    // 接收的生日日期 , 计算活了多少天
    public static void getDays(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s);
        long start = date.getTime();

        Date date2 = new Date();
        long end = date2.getTime();

        System.out.println("活了"+(end - start)/(1000L*60*60*24)+"天");
    }
}