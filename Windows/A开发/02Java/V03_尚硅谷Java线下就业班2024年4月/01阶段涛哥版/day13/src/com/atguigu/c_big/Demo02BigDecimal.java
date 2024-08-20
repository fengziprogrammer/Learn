package com.atguigu.c_big;

import java.math.BigDecimal;

public class Demo02BigDecimal {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("3.15");
        BigDecimal b2 = new BigDecimal("2.12");
        BigDecimal add = b1.add(b2);
        System.out.println("add = " + add);

        BigDecimal subtract = b1.subtract(b2);
        System.out.println("subtract = " + subtract);

        BigDecimal multiply = b1.multiply(b2);
        System.out.println("multiply = " + multiply);

        //BigDecimal divide = b1.divide(b2);
        //System.out.println("divide = " + divide);  如果除不尽,报错
    }
}
