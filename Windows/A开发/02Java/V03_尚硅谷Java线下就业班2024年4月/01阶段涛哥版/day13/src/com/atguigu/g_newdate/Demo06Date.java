package com.atguigu.g_newdate;

import java.time.LocalDate;
import java.time.Period;

public class Demo06Date {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2022, 12, 12);
        LocalDate localDate2 = LocalDate.of(2021, 11, 11);
        Period period = Period.between(localDate2, localDate1);
        //getYears()->获取相差的年
        System.out.println("period.getYears() = " + period.getYears());
        //getMonths()->获取相差的月
        System.out.println("period.getMonths() = " + period.getMonths());
        //getDays()->获取相差的天
        System.out.println("period.getDays() = " + period.getDays());
    }
}
