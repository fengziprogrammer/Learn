package com.atguigu.g_newdate;

import java.time.LocalDate;

public class Demo03Date {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate.getYear() = " + localDate.getYear());
        System.out.println("localDate.getMonthValue() = " + localDate.getMonthValue());
        System.out.println("localDate.getDayOfMonth() = " + localDate.getDayOfMonth());
    }
}
