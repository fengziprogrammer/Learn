package com.atguigu.d_junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo01Junit {
    @Test
    public void method01(){
        System.out.println("我是@Test");
    }

    @Test
    public void method02(){
        System.out.println("我是@Test2");
    }

    @Before
    public void method03Defore(){
        System.out.println("我是@Before");
    }

    @After
    public void method04After(){
        System.out.println("我是@After");
    }
}
