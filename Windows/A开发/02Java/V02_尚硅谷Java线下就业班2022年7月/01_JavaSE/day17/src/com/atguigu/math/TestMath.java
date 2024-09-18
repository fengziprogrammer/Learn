package com.atguigu.math;

import org.junit.Test;

/*
1、java.lang.Math类

 */
public class TestMath {
    @Test
    public void test01(){
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));
    }

    @Test
    public void test02(){
        System.out.println(Math.ceil(2.4));//ceil：天花板  向上取整
        System.out.println(Math.floor(2.4));//floor：地板  向下取整
        System.out.println(Math.round(2.4));//round：四周，周围  四舍五入
        System.out.println("------------------------");
        System.out.println(Math.ceil(2.7));//ceil：天花板
        System.out.println(Math.floor(2.7));//floor：地板
        System.out.println(Math.round(2.7));//round：四周，周围

        System.out.println("-----------------------");

    }

    @Test
    public void test03(){
        System.out.println(Math.ceil(-2.4));//ceil：天花板  向上取整
        System.out.println(Math.floor(-2.4));//floor：地板  向下取整
        System.out.println(Math.round(-2.4));//round：四周，周围  四舍五入
        System.out.println("------------------------");
        System.out.println(Math.ceil(-2.7));//ceil：天花板
        System.out.println(Math.floor(-2.7));//floor：地板
        System.out.println(Math.round(-2.7));//round：四周，周围
    }

    @Test
    public void test04(){
        System.out.println(Math.pow(2,5));//32
        System.out.println(Math.pow(2.5, 3.6));

        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(9.6));

        System.out.println(Math.random());//[0,1)
    }

    @Test
    public void test05(){
        System.out.println(Math.max(2,6));
        System.out.println(Math.min(2,6));
    }
}
