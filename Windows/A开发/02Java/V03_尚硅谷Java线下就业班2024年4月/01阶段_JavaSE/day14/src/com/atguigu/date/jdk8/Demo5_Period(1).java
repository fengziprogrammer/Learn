package com.atguigu.date.jdk8;

import java.time.LocalDate;
import java.time.Period;

public class Demo5_Period {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2023,6,17);
        LocalDate localDate2 = LocalDate.of(2028,11,19);

        Period period = Period.between(localDate1, localDate2);
        System.out.println(period);//P5Y5M2D
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period.toTotalMonths());


    }
}
