package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    SimpleDateFormat可以对Date对象, 进行格式化和解析

    日期模式字符串中,字母的对应关系
        y	年
        M	月
        d	日
        H	时
        m	分
        s   秒

    SimpleDateFormat构造方法
        public SimpleDateFormat(); 构造一个SimpleDateFormat对象, 使用默认格式
        public SimpleDateFormat(String 格式); 构造一个SimpleDateFormat对象,使用指定格式

    SimpleDateFormat成员方法
        格式化 public final String format(Date date); 格式化为指定格式
        解析 public Date parse(String source); 从指定格式解析为日期对象
 */
public class DateDemo03 {
    public static void main(String[] args) throws ParseException {
        //Date -> String
        //创建日期对象
        Date date = new Date();
        //创建日期格式化对象
        //SimpleDateFormat sdf = new SimpleDateFormat(); //空参,默认格式
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"); //带参,指定格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //带参,指定格式
        //格式化
        String s = sdf.format(date);
        System.out.println(s);
        /*
             空参,默认格式 2022/10/12 下午4:39
             带参,指定格式1 2022年10月12日 16:41:29
             带参,指定格式2 2022-10-12 16:41:53
         */

        System.out.println("--------------------");

        //String -> Date
        //被解析的字符串(包含年月日时分秒的,一般是别人给我们的)
        String str = "2022年10月12日 16:41:29";
        //创建日期格式化对象, 给出的格式必须和字符串中保持一致, 否则报错!
        //SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //报一个解析异常
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //解析
        Date d = sdf2.parse(str); //报错: Alt+回车,选择Add..敲回车
        System.out.println(d); //Wed Oct 12 16:41:29 CST 2022
    }
}
