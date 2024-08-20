package com.atguigu.g_newdate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo07Date {
    public static void main(String[] args) {
        LocalDateTime localDate1 = LocalDateTime.of(2022, 12, 12,12,12,12);
        LocalDateTime localDate2 = LocalDateTime.of(2021, 11, 11,11,11,11);

        Duration duration = Duration.between(localDate2, localDate1);
        //toDays():获取相差天数
        System.out.println("duration.toDays() = " + duration.toDays());
        //toHours():获取相差小时
        System.out.println("duration.toHours() = " + duration.toHours());
        //toMinutes():获取相差分钟
        System.out.println("duration.toMinutes() = " + duration.toMinutes());
        //toMillis():获取相差秒(毫秒)
        System.out.println("duration.toMillis() = " + duration.toMillis());
    }
}
