package com.atguigu.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2_DateFormat {


    /*
        SimpleDateFormat
            可以将date类型与String类型做相互转换

        - public SimpleDateFormat()//默认的时间转换格式

        - public SimpleDateFormat(String pattern)//自定义格式  取决于  参数格式
     */
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date); // 默认格式 Sat Jun 17 11:18:48 CST 2023

        // SimpleDateFormat 默认格式
       /* SimpleDateFormat sdf = new SimpleDateFormat();
        // System.out.println(sdf);// 不做转换前 输出的是默认的toString  java.text.SimpleDateFormat@b5341f2a
        String s1 = sdf.format(date);
        System.out.println(s1); // SimpleDateFormat 默认格式  23-6-17 上午11:21*/

        // 使用 SimpleDateFormat 自定义格式
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s1 = sdf.format(date);
        System.out.println(s1);

        String s2 = "2023年06月17日 11:26:12";
        Date date2 = sdf.parse(s2);
        System.out.println(date2);


    }
}
