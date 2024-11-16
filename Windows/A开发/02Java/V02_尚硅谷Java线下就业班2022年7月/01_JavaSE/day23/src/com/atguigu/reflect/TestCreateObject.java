package com.atguigu.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

/*
反射的应用之二：创建任意类型的对象
当然不包括 基本数据类型和void，抽象类，接口等。

方案一：
步骤：
（1）先获取这个类的Class对象
（2）调用Class对象的newInstance()方法来创建实例对象
这种方式创建对象有限制，必须要求这个类有无参的公共构造器。

方案二：
步骤：
（1）先获取这个类的Class对象
（2）先获取有参构造器对象
（3）调用构造器对象的newInstance(...)方法来创建实例对象
如果构造器是非公共的，那么需要调用 构造器对象的setAccessible(true)

结论：为了后期很多的框架可以为你的类自动创建的对象更方便，请保留你这个类公共的无参构造。


 */
public class TestCreateObject {
    @Test
    public void test01()throws Exception{
//        AtGuiguClass a =new AtGuiguClass();//不可行
        Class<?> clazz = Class.forName("com.atguigu.ext.demo.AtGuiguClass");
        Object obj = clazz.newInstance();
        //obj是 AtGuiguClass类的对象
        System.out.println(obj);

    }

    @Test
    public void test02()throws Exception{

        Class<?> clazz = Class.forName("com.atguigu.ext.demo.AtGuiguDemo");
        Object obj = clazz.newInstance();
        /*
        java.lang.InstantiationException: com.atguigu.ext.demo.AtGuiguDemo
        Caused by: java.lang.NoSuchMethodException: com.atguigu.ext.demo.AtGuiguDemo.<init>()
        解释：AtGuiguDemo没有无参构造
         */
        //obj是 AtGuiguDemo类的对象
        System.out.println(obj);
    }

    @Test
    public void test03()throws Exception{
        Class<?> clazz = Class.forName("com.atguigu.ext.demo.AtGuiguDemo");
        Constructor<?> c1 = clazz.getDeclaredConstructor(String.class, int.class);//通过构造器的形参类型列表来确定具体是哪个构造器
        Object obj = c1.newInstance("尚硅谷", 666);
        System.out.println(obj);
    }

    @Test
    public void test04()throws Exception{
        Class<?> clazz = Class.forName("com.atguigu.ext.demo.AtGuiguNoPublicCon");
        Constructor<?> c1 = clazz.getDeclaredConstructor(String.class, int.class);//通过构造器的形参类型列表来确定具体是哪个构造器
        c1.setAccessible(true);//跳过权限修饰符检查
        Object obj = c1.newInstance("尚硅谷", 666);
        System.out.println(obj);
    }
}
