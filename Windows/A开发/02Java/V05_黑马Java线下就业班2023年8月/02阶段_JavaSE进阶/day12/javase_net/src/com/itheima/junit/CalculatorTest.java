package com.itheima.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calc = null;

    @Before
    public void init(){
         calc = new Calculator();
    }

    @Test
    public void testAdd2(){
        int add = calc.add(1, 2);

        //断言：方法的执行结果是5
        Assert.assertEquals(5, add);
    }


    
    @Test  //测试add方法
    public void testAdd(){

        int result = calc.add(5);
        System.out.println(result);
    }

    @Test
    public void testSubtract(){

        calc.subtract(6);
    }

}
