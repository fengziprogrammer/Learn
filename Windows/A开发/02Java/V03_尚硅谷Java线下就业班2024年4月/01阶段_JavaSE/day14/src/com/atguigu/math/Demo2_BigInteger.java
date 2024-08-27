package com.atguigu.math;

import java.math.BigInteger;

public class Demo2_BigInteger {

    /*
    构造方法
	- public BigInteger(String val)
    成员方法
	- BigInteger add(BigInteger val)            加
	- BigInteger subtract(BigInteger val)       减
	- BigInteger multiply(BigInteger val)       乘
	- BigInteger divide(BigInteger val)         除
	- BigInteger remainder(BigInteger val)      余
     */
    public static void main(String[] args) {

        // long num = 29387384957848758326544738957l;
        BigInteger bi1 = new BigInteger("29387384957848758326544738957");
        BigInteger bi2 = new BigInteger("89387384957848758326544738957");

        System.out.println(bi1.add(bi2));
        System.out.println(bi1.subtract(bi2));
        System.out.println(bi1.multiply(bi2));
        System.out.println(bi1.divide(bi2));
        System.out.println(bi1.remainder(bi2));
    }
}
