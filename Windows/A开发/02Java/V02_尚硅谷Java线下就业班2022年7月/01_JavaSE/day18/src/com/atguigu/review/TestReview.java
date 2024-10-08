package com.atguigu.review;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestReview {
    @Test
    public void test01(){
        String str = "2022-02-14 08:51";//json,web传给服务器端一个字符串，这个字符串是代表一个日期时间值
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        try {
            Date d = sf.parse(str);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
