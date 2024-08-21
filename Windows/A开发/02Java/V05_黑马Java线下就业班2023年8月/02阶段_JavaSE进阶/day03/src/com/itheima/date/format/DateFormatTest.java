
package com.itheima.date.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormatTest {
    //演示：日期格式化、日期解析
    public static void main(String[] args) throws ParseException {
       // method1();

        String str = "2020年10月31日 17:00:00";
        method2(str);
    }

    //解析日期
    public static void method2(String s) throws ParseException {
        //创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        //String类型 -> Date类型
        Date date = sdf.parse(s);

        System.out.println(date);
    }



    //把日期转换为字符串
    public static void method1() {
        //日期对象
        Date date = new Date();
        System.out.println(date);

        //创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //日期转换为字符串 （按照日期模板，把日期对象变为相应格式的字符串）
        String strDate = sdf.format(date);

        System.out.println(strDate);
    }
}
