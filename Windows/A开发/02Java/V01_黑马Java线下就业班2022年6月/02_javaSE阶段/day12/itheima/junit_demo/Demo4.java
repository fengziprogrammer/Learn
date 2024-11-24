package com.itheima.junit_demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo4 {

    @Test
    public void show() {
        System.out.println("此方法被Test注解修饰 , 此方法可以独立执行");
    }

    @After
    public void show2() {
        System.out.println("此方法被After注解修饰...");
    }

    @Before
    public void show3() {
        System.out.println("此方法被Before注解修饰...");
    }

}
