package com.itheima.api_demo.bigdecimal_demo;

import java.math.BigDecimal;

/*
    构造方法 :
        public BigDecimal(String val)	将 BigDecimal 的字符串表示形式转换为 BigDecimal

    成员方法 :
        public BigDecimal add(BigDecimal value)	加法运算
        public BigDecimal subtract(BigDecimal value)	减法运算
        public BigDecimal multiply(BigDecimal value)	乘法运算
        public BigDecimal divide(BigDecimal value)	除法运算(除不尽会有异常)
        public BigDecimal divide(BigDecimal divisor, int scale , int roundingMode)	除法运算(除不尽，使用该方法)
        参数说明：
        scale 精确位数，
        roundingMode取舍模式
                   BigDecimal.ROUND_HALF_UP 四舍五入
                   BigDecimal.ROUND_FLOOR 去尾法
                   BigDecimal.ROUND_UP  进一法
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        // System.out.println(0.1 + 0.2);
        //  public BigDecimal(String val)	将 BigDecimal 的字符串表示形式转换为 BigDecimal
        BigDecimal decimal1 = new BigDecimal("0.1");
        BigDecimal decimal2 = new BigDecimal("0.2");

        //  public BigDecimal add(BigDecimal value)	加法运算
        BigDecimal add = decimal1.add(decimal2);
        System.out.println(add);

        //  public BigDecimal subtract(BigDecimal value)	减法运算
        BigDecimal subtract = decimal1.subtract(decimal2);
        System.out.println(subtract);

        // public BigDecimal multiply(BigDecimal value)	乘法运算
        BigDecimal multiply = decimal1.multiply(decimal2);
        System.out.println(multiply);

        BigDecimal decimal11 = new BigDecimal("10");
        BigDecimal decimal22 = new BigDecimal("3");
        // public BigDecimal divide(BigDecimal value)	除法运算(除不尽会有异常)
        // BigDecimal divide = decimal11.divide(decimal22);
        // System.out.println(divide);

        /*
            public BigDecimal divide(BigDecimal divisor, int scale , int roundingMode)	除法运算(除不尽，使用该方法)
            参数说明：
            scale 精确位数，
            roundingMode取舍模式
                       BigDecimal.ROUND_HALF_UP 四舍五入
                       BigDecimal.ROUND_FLOOR 去尾法
                       BigDecimal.ROUND_UP  进一法
         */
//        BigDecimal divide = decimal11.divide(decimal22, 3, BigDecimal.ROUND_HALF_UP);
        BigDecimal divide = decimal11.divide(decimal22, 3, BigDecimal.ROUND_UP);
        System.out.println(divide);
    }
}
