package com.atguigu.d_junit;

import org.junit.*;

import java.util.ArrayList;

/**
 * 专门测功能的类
 */
public class Demo03Junit {
    @Test
    public void method01(){
        System.out.println("我是@Test");
    }

    @Test
    public void method02(){
        System.out.println("我是@Test2");
    }

    @BeforeClass
    public static void method03Defore(){
        System.out.println("我是@Before");
    }

    @AfterClass
    public static void method04After(){
        System.out.println("我是@After");
    }
}
