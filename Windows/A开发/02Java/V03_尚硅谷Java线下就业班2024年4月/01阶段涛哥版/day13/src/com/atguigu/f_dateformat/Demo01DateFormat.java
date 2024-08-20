package com.atguigu.f_dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String format(Date date) -> 将Date对象按照指定格式转成String
        String time = sdf.format(date);
        System.out.println("time = " + time);

        System.out.println("====================================");

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeDate = "2000-10-10 10:10:10";
        //Date parse(String source) -> 将符合指定格式的String转成Date对象
        Date date1 = sdf1.parse(timeDate);
        System.out.println("date1 = " + date1);

    }
}
