package com.atguigu.c_big;

import java.math.BigInteger;

public class Demo01BigInteger {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("121212121212121212121212121212121212");
        BigInteger b2 = new BigInteger("121212121212121212121212121212121212");

        BigInteger add = b1.add(b2);
        System.out.println("add = " + add);

        BigInteger subtract = b1.subtract(b2);
        System.out.println("subtract = " + subtract);

        BigInteger multiply = b1.multiply(b2);
        System.out.println("multiply = " + multiply);

        BigInteger divide = b1.divide(b2);
        System.out.println("divide = " + divide);
    }
}
