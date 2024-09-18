package com.atguigu.date;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;

/*
第三代：
    LocalDate、LocalTime、LocalDateTime
    ZoneId和ZonedDateTime
    持续日期/时间：Period和Duration
 */
public class TestThree {
    @Test
    public void test01(){
        LocalDate date = LocalDate.now();
        System.out.println(date);//2022-02-12

        LocalDate kai = LocalDate.of(2022, 2, 4);
        System.out.println(kai);
    }

    @Test
    public void test02(){
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime of = LocalTime.of(12, 0, 0);
        System.out.println(of);
    }

    @Test
    public void test03(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime of = LocalDateTime.of(2022, 2, 4, 8, 24);
        System.out.println(of);
    }

    @Test
    public void test04(){
        int day = LocalDate.now().getDayOfMonth();
        System.out.println(day);

        int days = LocalDate.now().getDayOfYear();
        System.out.println(days);
    }

    @Test
    public void test05(){
        LocalDate today = LocalDate.now();
        LocalDate date2 = today.withDayOfMonth(25);
        System.out.println(today);
        System.out.println(date2);
    }

    @Test
    public void test06(){
        LocalDate today = LocalDate.now();
        System.out.println(today.isLeapYear());//false
        /*
        num % 4 == 0   结果范围[0,1,2,3]
        num & 3 == 0	结果范围[0,1,2,3]

        num的二进制  xxxxxxxx
        3的二进制    00000011
        &--------------------
                     00000000		0
                     00000001		1
                     00000010		2
                     00000011		3
         */
    }


    @Test
    public void test07(){
        //Set一个集合，是一个容器，装对象
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            System.out.println(availableZoneId);
        }
    }

    @Test
    public void test08(){
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(now);
        //2022-02-11T19:23:31.013-08:00[America/Los_Angeles]
    }

    @Test
    public void test09(){
        LocalDate today = LocalDate.now();
        LocalDate kai = LocalDate.of(2022,2,4);
        Period period = Period.between(today,kai);
        System.out.println(period);
    }

    @Test
    public void test10(){
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1992,5,1);
        Period period = Period.between(today,birthday);
        System.out.println(period);
    }

    @Test
    public void test11(){
        LocalTime now = LocalTime.now();
        LocalTime of = LocalTime.of(12, 0, 0);
        Duration d = Duration.between(now,of);
        System.out.println(d);
    }

    @Test
    public void test12(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(df.format(now));//2022-02-12T11:29:27.007
    }

    @Test
    public void test13(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(df.format(now));//22-2-12 上午11:30

        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(df2.format(now));//2022-2-12 11:30:42

        DateTimeFormatter df3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        System.out.println(df3.format(now));//2022年2月12日 上午11时31分11秒

        DateTimeFormatter df4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(ZoneId.systemDefault());;
        System.out.println(df4.format(now));//2022年2月12日 星期六 上午11时32分22秒 CT

        DateTimeFormatter df5 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(ZoneId.of("America/Los_Angeles"));;
        System.out.println(df5.format(now));//2022年2月12日 星期六 上午11时32分55秒 PT

    }

    @Test
    public void test14(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(now));
    }
}
