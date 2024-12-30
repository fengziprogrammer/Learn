package com.itheima.sh.a_junit_test_01;

import org.junit.*;

/*
    结果：
        beforeClass....
        before....
        test....
        after....
        before....
        test1....
        after....
        afterClass....
 */
public class Junit02Test {

    //定义测试方法
    @Test
    public void test(){
        System.out.println("test....");
    }

    @Test
    public void test1(){
        System.out.println("test1....");
    }


    //每执行一次测试方法之前都会执行一次@Before修饰的方法
    @Before
    public void before(){
        System.out.println("before....");
    }

    //每执行一次测试方法之后都会执行一次@After修饰的方法
    @After
    public void after(){
        System.out.println("after....");
    }

    //在执行测试方法之前只会执行一次@BeforeClass修饰的方法
    //实际应用场景：初始化当前测试环境的内容
    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass....");
    }

    //在执行测试方法之后只会执行一次@AfterClass修饰的方法
    //应用场景：释放资源
    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass....");
    }
   

}
