package com.atguigu.g_newdate;

import java.time.LocalDate;

public class Demo05Date {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        //LocalDate localDate1 = localDate.plusYears(1);
        //System.out.println(localDate1.getYear());

        System.out.println("=======================");
        LocalDate localDate1 = localDate.minusYears(1);
        System.out.println(localDate1.getYear());
    }
}
