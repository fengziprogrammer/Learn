package com.atguigu.c_reflect;

import java.io.FileInputStream;
import java.util.Properties;

public class Test02 {
    public static void main(String[] args)throws Exception {
        Properties properties = new Properties();
        FileInputStream in = new FileInputStream("day22_reflect\\pro.properties");
        properties.load(in);

        String className = properties.getProperty("className");

        Class<?> aClass = Class.forName(className);
        System.out.println("aClass = " + aClass);
    }
}
