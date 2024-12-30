package com.itheima.sh.g_anno_07;

import java.lang.reflect.Method;

public class ParseAnnoTest {
    public static void main(String[] args) throws Exception{
        /*
            需求：运行jvm虚拟机直接运行Demo01类中加@MyTest注解的所有方法
         */
        //1.获取Demo01类的Class对象
        Class<?> clazz = Class.forName("com.itheima.sh.g_anno_07.Demo01");
        //2.获取Demo01类中所有public修饰的方法
        Method[] methods = clazz.getMethods();
        //3.遍历数组取出每个方法
        for (Method m : methods) {
            //4.判断取出的方法上是否含有注解@MyTest
            if(m.isAnnotationPresent(MyTest.class)){
                //说明方法上含有注解MyTest
                //5.运行此方法
                m.invoke(clazz.newInstance());
            }

        }

    }
}
