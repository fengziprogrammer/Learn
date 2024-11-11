package com.atguigu.d_reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test01 {
    public static void main(String[] args)throws Exception {
        //1.创建Properties集合
        Properties properties = new Properties();
        //2.读取配置文件
        InputStream in = Test01.class.getClassLoader().getResourceAsStream("pro.properties");
        //3.将流中的数据加载到集合中
        properties.load(in);
        //4.获取读取到的配置文件中的信息
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        //5.根据className获取class对象
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        //6.根据methodName获取方法
        Method method = aClass.getMethod(methodName);
        //7.执行被反射出来的方法
        method.invoke(o);
    }
}
