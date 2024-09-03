package com.itheima.api_demo.dateformat_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    DateFormat抽象类
        --SimpleDateFormat类

    SimpleDateFormat学习原因
        String --> Date : 解析
            public Date parse(String source) throws ParseException

        Date --> String : 格式化
            public String format(Date date)

    构造方法
        1 public SimpleDateFormat() : 使用默认的模板创建SimpleDateFormat对象
        2 public SimpleDateFormat(String pattern) : 使用指定日期模板创建SimpleDateFormat对象

    需求 : 录入您的生日 , 算算活了多少天 ?
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        // 键盘录入生日
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日(xxxx年xx月xx日):");
        String birthday = sc.nextLine();

        // 解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        Date d1 = sdf.parse(birthday);
        long start = d1.getTime();

        // 当前系统时间
        Date d2 = new Date();
        long end = d2.getTime();

        System.out.println("活了"+(end-start)/(1000L*60*60*24*365)+"年");
    }
}
