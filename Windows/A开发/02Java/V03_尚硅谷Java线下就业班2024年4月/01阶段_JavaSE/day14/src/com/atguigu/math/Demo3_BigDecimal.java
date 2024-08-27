package com.atguigu.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo3_BigDecimal {

    /*
    构造方法
	- public BigDecimal(String val)
    成员方法
	- BigDecimal(String val)
	- BigDecimal add(BigDecimal val)
	- BigDecimal subtract(BigDecimal val)
	- BigDecimal multiply(BigDecimal val)
	- BigDecimal divide(BigDecimal val)
	- BigDecimal divide(BigDecimal divisor, int roundingMode)
	- BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
	- BigDecimal remainder(BigDecimal val)

     */
    public static void main(String[] args) {

        // double d1 = 2.0;
        // double d2 = 1.1;
        // double d3 = d1 -d2;
        // System.out.println(d3);// 0.8999999999999999

        BigDecimal bi1 = new BigDecimal("2.0");
        BigDecimal bi2 = new BigDecimal("1.1");
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.subtract(bi2));// 0.9
        System.out.println(bi1.multiply(bi2));
        // System.out.println(bi1.divide(bi2));// 报错 小数除不尽 2.0 /1.1
        System.out.println(bi1.divide(bi2, RoundingMode.DOWN));// 2.0 /1.1
        System.out.println(bi1.divide(bi2, 10,RoundingMode.DOWN));// 2.0 /1.1
        System.out.println(bi1.divide(bi2, 20,RoundingMode.DOWN));// 2.0 /1.1
        System.out.println(bi1.remainder(bi2));

    }
}
