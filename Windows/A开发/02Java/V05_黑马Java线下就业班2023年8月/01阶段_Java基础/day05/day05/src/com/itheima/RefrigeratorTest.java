package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
    冰箱测试类
 */
public class RefrigeratorTest {
    public static void main(String[] args) {
        //创建冰箱对象
        Refrigerator r = new Refrigerator();
        //打印对象名
        System.out.println(r); //com.itheima.Refrigerator@7ef20235
        //展示对象属性
        //r.show();
        //赋值
        r.setBrand("创维SKYWORTH");
        r.setCapacity(186);//单位:升
        r.setType("BCD-186D");
        r.setBrand("银色");
        r.setPrice(869.00);
        //展示对象属性
        r.show();
        //创建新对象,查看地址
        Refrigerator r2 = new Refrigerator();
        System.out.println(r2); //com.itheima.Refrigerator@27973e9b
    }
}
