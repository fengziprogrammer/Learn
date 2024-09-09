package com.itheima.api_demo.biginteger_demo;


import java.math.BigInteger;

/*
      构造方法 :
          public BigInteger(String value)	 : 可以将整数的字符串，转换为BigInteger对象

      成员方法 :
          public BigInteger add (BigInteger value)	超大整数加法运算
          public BigInteger subtract (BigInteger value)	超大整数减法运算
          public BigInteger multiply (BigInteger value)	超大整数乘法运算
          public BigInteger divide (BigInteger value)	超大整数除法运算，除不尽取整数部分
*/
public class BigIntegerDemo {
    public static void main(String[] args) {
//        int num = 2147483647;
//        System.out.println(num + 1);
        // public BigInteger(String value)	 : 可以将整数的字符串，转换为BigInteger对象
        BigInteger bigInteger1 = new BigInteger("2147483647");
        // System.out.println(bigInteger1);

        // public BigInteger add (BigInteger value)	超大整数加法运算
        BigInteger add = bigInteger1.add(new BigInteger("1"));
        System.out.println(add);

        // public BigInteger subtract (BigInteger value)	超大整数减法运算
        BigInteger subtract = bigInteger1.subtract(new BigInteger("1"));
        System.out.println(subtract);

        //  public BigInteger multiply (BigInteger value)	超大整数乘法运算
        BigInteger multiply = bigInteger1.multiply(new BigInteger("2"));
        System.out.println(multiply);

        //  public BigInteger divide (BigInteger value)	超大整数除法运算，除不尽取整数部分
        BigInteger divide = bigInteger1.divide(new BigInteger("2"));
        System.out.println(divide);
    }

}
