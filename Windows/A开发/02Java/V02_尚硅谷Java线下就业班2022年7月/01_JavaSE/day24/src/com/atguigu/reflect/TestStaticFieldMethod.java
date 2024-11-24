package com.atguigu.reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
演示：如何通过反射操作某个类的静态变量和静态方法
反射操作静态方法的步骤：
（1）获取Class对象
（2）先获取你要调用的方法的Method对象
（3）调用方法
通过Method对象.invoke(实例对象，实参)

反射操作静态变量的步骤
（1）获取Class对象
(2)获取要操作/访问的静态变量的Field对象
(3)某个静态变量对应的Field对象.setAccessible(true); （如果修饰符允许，可以省略这步）
(4)可以访问静态变量的值，或者给静态变量赋值
  某个静态变量对应的Field对象.get(null)就是获取静态变量的值
  某个静态变量对应的Field对象.set(null,值)就是设置静态变量的值
 */
public class TestStaticFieldMethod {
    @Test
    public void test01()throws Exception{
        /*
        通过反射  调用com.atguigu.ext.demo.AtGuiguClass.printInfo(String info)，它是静态方法
         */
        Class clazz = Class.forName("com.atguigu.ext.demo.AtGuiguClass");

        //（2）先获取你要调用的方法的Method对象
        Method printInfoMethod = clazz.getDeclaredMethod("printInfo", String.class);

        //（3）调用方法printInfo(String info)
        Object returnValue = printInfoMethod.invoke(null, "尚硅谷");//这里null表示没有AtGuiguClass类的对象，这里“尚硅谷"是给printInfo方法 实参
        System.out.println("returnValue = " + returnValue);//结果是null，因为printInfo方法 是void的，没有返回值，所以是null
    }

    @Test
    public void test02()throws Exception{
        /*
        通过反射访问Student类的静态变量school
         */
        Class clazz = Class.forName("com.atguigu.bean.Student");

        Field schoolField = clazz.getDeclaredField("school");

        schoolField.setAccessible(true);

        schoolField.set(null,"尚硅谷");

        System.out.println(schoolField.get(null));

    }
}
