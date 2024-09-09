package com.itheima.homework.test6;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    获取当前系统的时间，以“xxxx年xx月xx日 xx时xx分xx秒”的格式打印出来
 */
public class Test6 {
    public static void main(String[] args) {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        // 格式化 : Date --> String
        String strDate = sdf.format(d);

        System.out.println(strDate);
    }
}
