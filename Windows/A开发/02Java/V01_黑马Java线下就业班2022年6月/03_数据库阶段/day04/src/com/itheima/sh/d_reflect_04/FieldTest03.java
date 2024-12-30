package com.itheima.sh.d_reflect_04;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldTest03 {

    @Test
    public void test01() throws Exception{
        //需求：使用反射技术执行Person类中的成员变量address
        //1.获取Person类的Class对象
        Class<?> clazz = Class.forName("com.itheima.sh.d_reflect_04.Person");
        //2.获取Person类中的成员变量 private String address;
        Field f = clazz.getDeclaredField("address");
        //3.暴力反射
        f.setAccessible(true);
        //4.给address赋值
        //创建Person对象
        Person p1 = (Person) clazz.newInstance();
        f.set(p1,"上海");//p1表示Person对象名，上海表示给address赋的实际值
        //5.获取值
        Object value = f.get(p1);//p1表示Person对象名
        System.out.println("value = " + value);
    }


}
