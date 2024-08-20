package com.atguigu.c_big;

import java.math.BigDecimal;

public class Demo03BigDecimal {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("3.15");
        BigDecimal b2 = new BigDecimal("2.12");

        BigDecimal divide = b1.divide(b2,2,BigDecimal.ROUND_UP);
        System.out.println("divide = " + divide);
    }
}
