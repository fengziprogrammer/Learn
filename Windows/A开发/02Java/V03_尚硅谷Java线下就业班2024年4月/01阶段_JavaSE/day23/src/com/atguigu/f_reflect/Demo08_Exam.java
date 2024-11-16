package com.atguigu.f_reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo08_Exam {
    public static void main(String[] args)throws Exception {
        //1.创建properties集合
        Properties properties = new Properties();
        //2.读取配置文件
        InputStream in = Demo08_Exam.class.getClassLoader().getResourceAsStream("pro.properties");
        //3.将流中的数据装载到集合中
        properties.load(in);
        //4.获取配置文件中的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //5.根据获取出来的全限定名创建class对象
        Class<?> aClass = Class.forName(className);
        //6.创建对象
        Object o = aClass.newInstance();
        //7.根据获取出来的方法名反射方法
        Method method = aClass.getMethod(methodName);
        //8.执行方法
        method.invoke(o);
    }
}
