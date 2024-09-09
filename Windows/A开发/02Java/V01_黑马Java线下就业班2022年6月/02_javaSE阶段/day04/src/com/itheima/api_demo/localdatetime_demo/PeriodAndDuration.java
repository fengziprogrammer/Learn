package com.itheima.api_demo.localdatetime_demo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.Temporal;

/*
    Period时间间隔类(年月日)
        public static Period between(开始时间,结束时间)计算两个“时间"的间隔 , 注意 : 参数是LocalDate

        public int getYears()获得这段时间的年数
        public int getMonths()获得此期间的总月数
        public int getDays()获得此期间的天数

    Duration时间间隔类(时分秒)
        public static Duration between(开始时间,结束时间)计算两个“时间"的间隔 , 注意 : 参数是LocalDateTime

 */
public class PeriodAndDuration {
    public static void main(String[] args) {
        LocalDateTime time1 = LocalDateTime.of(2021, 11, 11, 13, 0, 0);
        LocalDateTime time2 = LocalDateTime.now();
        Duration duration = Duration.between(time1, time2);

        System.out.println(duration.toHours());            // 时
        System.out.println(duration.toMinutes());          // 分
        System.out.println(duration.toMillis() / 1000);    // 秒
        System.out.println(duration.toMillis());           // 毫秒
        System.out.println(duration.toNanos());            // 纳秒
    }

    private static void method() {
        //  public static Period between(开始时间,结束时间)计算两个“时间"的间隔 , 注意 : 参数是LocalDate
        LocalDate localDate1 = LocalDate.of(2023, 5, 12);
        LocalDate localDate2 = LocalDate.now();// 2021 , 11 , 11
        Period period = Period.between(localDate2, localDate1);

//        public int getYears()获得这段时间的年数
        System.out.println(period.getYears());
//        public int getMonths()获得此期间的总月数
        System.out.println(period.getMonths());
//        public int getDays()获得此期间的天数
        System.out.println(period.getDays());
    }
}
