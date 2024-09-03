package com.itheima.api_demo.dateformat_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    DateFormat类 :
        public abstract class DateFormat : 抽象类不能直接使用 , 需要使用其子类
        public class SimpleDateFormat : 使用此类

    构造方法 :
        public SimpleDateFormat() : 使用默认日期模板创建对象
        public SimpleDateFormat(String pattern) : 使用指定日期模板创建对象

    作用 : 日期和字符串之间做转换
        String --> Date  : 解析   parse()
        Date --> String  : 格式化 format()

    需求1 : 获取当前的日期对象，使用格式：yyyy-MM-dd HH:mm:ss 来表示，例如：2020-10-31 17:00:00【格式化】
    需求2 : 将字符串的 2020年10月31日  17:00:00，转换为日期Date对象。【解析】

    把代码抽取到一个方法中 : ctrl+ alt + m
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        // method();
        // String --> Date : 解析
        String s = "2099/02/02 12:12:12";

        // 日期格式化器
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        // 解析
        Date date = sdf.parse(s);

        System.out.println(date);
        //  Jan 01 12:12:12 CST 2099
        date.setTime(date.getTime() + 1000 * 60 * 60 * 24);
        System.out.println(date);
    }

    private static void method() {
        //  需求1 : 获取当前的日期对象，使用格式：yyyy-MM-dd HH:mm:ss 来表示，例如：2020-10-31 17:00:00【格式化】
        //  Date --> String : 格式化
        Date d = new Date();

        // 日期格式化器
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        // 格式化方法
        //  public String format(Date date)
        String strDate = sdf.format(d);

        System.out.println(strDate);
    }
}
