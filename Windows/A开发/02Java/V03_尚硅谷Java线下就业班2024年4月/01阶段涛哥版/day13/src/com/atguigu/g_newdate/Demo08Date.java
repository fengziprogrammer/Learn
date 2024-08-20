package com.atguigu.g_newdate;

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Demo08Date {
    public static void main(String[] args) {
        //format();
        parse();
    }

    /**
     *  TemporalAccessor parse(CharSequence text)  -> 将符合格式的字符串日期转成日期对象
     *                 返回值:TemporalAccessor接口,实现类有:LocalDate LocalDateTime
     *
     *  static LocalDateTime from(TemporalAccessor temporal)  -> 将 TemporalAccessor转成LocalDateTime
     */
    private static void parse() {
        String time = "2000-10-10 10:10:10";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        TemporalAccessor temporalAccessor = dtf.parse(time);
        System.out.println("temporalAccessor = " + temporalAccessor);
        LocalDateTime localDateTime = LocalDateTime.from(temporalAccessor);
        System.out.println("localDateTime = " + localDateTime);
    }

    /**
     * String format(TemporalAccessor temporal)  ->将日期对象按照指定格式转成String
     *                 TemporalAccessor是一个接口,是Temporal接口的子接口
     *                 实现类有:LocalDate,LocalDateTime
     */
    private static void format() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = dtf.format(localDateTime);
        System.out.println("time = " + time);
    }
}
