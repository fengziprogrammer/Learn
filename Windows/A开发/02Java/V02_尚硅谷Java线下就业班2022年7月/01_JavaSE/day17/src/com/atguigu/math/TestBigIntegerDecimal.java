package com.atguigu.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/*
java.lang包的类/接口使用不用import导包，其他包的类使用需要导包

2、java.math
（1）BigInteger：大整数
byte,short,int,long，当遇到这些整数类型都无法表示的更大的整数时，就可以使用BigInteger

（2）RoundingMode枚举类
CEILING ：向正无限大方向舍入的舍入模式。
DOWN ：向零方向舍入的舍入模式。
FLOOR：向负无限大方向舍入的舍入模式。
HALF_DOWN ：向最接近数字方向舍入的舍入模式，如果与两个相邻数字的距离相等，则向下舍入。
HALF_EVEN：向最接近数字方向舍入的舍入模式，如果与两个相邻数字的距离相等，则向相邻的偶数舍入。
HALF_UP：向最接近数字方向舍入的舍入模式，如果与两个相邻数字的距离相等，则向上舍入。
UNNECESSARY：用于断言请求的操作具有精确结果的舍入模式，因此不需要舍入。
UP：远离零方向舍入的舍入模式。

（3）BigDecimal
之前说小数类型有float和double，这两个类型都是不精确的，浮点型。
如果希望比float和double更精确的计算，需要使用BigDecimal。或者说数据范围超过float,double时，也要用BigDecimal。
 */
public class TestBigIntegerDecimal {
    @Test
    public void test01(){
        BigInteger b1 = new BigInteger("158885554557522565552555866");
        BigInteger b2 = new BigInteger("188688855545575225655556");

        /*
        基本数据类型运算直接使用运算符
        包装类对象的计算，先转为基本数据类型，再计算
        BigInteger等对象的计算只能调用方法
         */
        System.out.println("b1 + b2 = "  + b1.add(b2));
        System.out.println("b1 - b2 = " + b1.subtract(b2));
        System.out.println("b1 * b2 = " + b1.multiply(b2));
        System.out.println("b1 / b2 = " + b1.divide(b2));
        System.out.println("b1 % b2 = " + b1.remainder(b2));
    }

    @Test
    public void test02(){
        BigDecimal b1 = new BigDecimal("56693.457821158555557822114445574744555744");
        BigDecimal b2 = new BigDecimal("5853.457821158555557822114445574744555744");

        /*
        基本数据类型运算直接使用运算符
        包装类对象的计算，先转为基本数据类型，再计算
        BigInteger等对象的计算只能调用方法
         */
        System.out.println("b1 + b2 = "  + b1.add(b2));
        System.out.println("b1 - b2 = " + b1.subtract(b2));
        System.out.println("b1 * b2 = " + b1.multiply(b2));
//        System.out.println("b1 / b2 = " + b1.divide(b2));//如果除不尽，这个方法会报异常
        System.out.println("b1 / b2 = " + b1.divide(b2,20, RoundingMode.FLOOR));
        System.out.println("b1 / b2 = " + b1.divide(b2,22, RoundingMode.FLOOR));
        System.out.println("b1 % b2 = " + b1.remainder(b2));
    }
}
