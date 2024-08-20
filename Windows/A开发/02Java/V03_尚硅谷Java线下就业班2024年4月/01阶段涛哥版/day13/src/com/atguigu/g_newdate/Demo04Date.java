package com.atguigu.g_newdate;

import java.time.LocalDate;

public class Demo04Date {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
       // System.out.println("localDate = " + localDate);
       // System.out.println("=========================");
       // LocalDate localDate1 = localDate.withYear(2000);
       // System.out.println("localDate1 = " + localDate1);
       // System.out.println("=========================");
       // LocalDate localDate2 = localDate1.withMonth(12);
       // System.out.println("localDate2 = " + localDate2);
       // System.out.println("=========================");
       // LocalDate localDate3 = localDate2.withDayOfMonth(12);
       // System.out.println("localDate3 = " + localDate3);
        System.out.println("=================================");
        LocalDate localDate1 = localDate.withYear(2000).withMonth(12).withDayOfMonth(12);
        System.out.println("localDate1 = " + localDate1);
    }
}
