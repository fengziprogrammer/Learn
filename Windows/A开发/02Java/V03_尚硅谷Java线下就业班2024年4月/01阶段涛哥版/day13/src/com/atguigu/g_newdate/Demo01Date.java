package com.atguigu.g_newdate;

import java.time.LocalDate;

public class Demo01Date {
    public static void main(String[] args) {
        //a.static LocalDate now()
        LocalDate localDate1 = LocalDate.now();
        System.out.println("localDate1 = " + localDate1);
        //b.static LocalDate of(int year, int month, int dayOfMonth)
        LocalDate localDate2 = LocalDate.of(2000, 12, 12);
        System.out.println("localDate2 = " + localDate2);
    }
}
