package com.atguigu.date.jdk8;

import java.time.Duration;
import java.time.LocalDateTime;

public class Demo6_Duration {

    /*
        1秒 = 1000毫米
        1毫米 = 1000微秒
        1微秒 = 1000纳秒
     */
    public static void main(String[] args) {

        LocalDateTime dateTime1 = LocalDateTime.of(2028,11,11,11,11,11);
        LocalDateTime dateTime2 = LocalDateTime.of(2048,1,13,8,44,33);

        Duration duration = Duration.between(dateTime1, dateTime2);
        System.out.println(duration);
        System.out.println(duration.getSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());

    }
}
