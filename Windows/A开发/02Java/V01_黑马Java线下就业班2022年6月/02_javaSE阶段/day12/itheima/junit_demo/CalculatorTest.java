package com.itheima.junit_demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.Callable;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void add() {
        calculator.add(10);
        calculator.add(10);
        int result = calculator.getResult();
        // 断言
        // Assert.assertEquals(期望值 , 实际值);
        Assert.assertEquals(20 , result);
    }

    @Test
    public void subtract() {
        calculator.add(10);
        calculator.subtract(5);
        int result = calculator.getResult();

        Assert.assertEquals(5 , result);
    }

    // 注解@Ignore修饰的方法 , 不会执行, 忽略执行!
    @Ignore
    public void multiply() {

    }

    @Test
    public void divide() {
        calculator.add(100);
        calculator.divide(0);

        int result = calculator.getResult();

        // Assert.assertEquals(5  , result);
    }

    @Test
    public void square() {
        // calculator.add(10);
        calculator.square(10);
        int result = calculator.getResult();
        Assert.assertEquals(100 , result);
    }

    @Test(timeout = 3000)
    public void squareRoot() {
        calculator.squareRoot(9);
        int result = calculator.getResult();
        Assert.assertEquals(3 , result);
    }
}
