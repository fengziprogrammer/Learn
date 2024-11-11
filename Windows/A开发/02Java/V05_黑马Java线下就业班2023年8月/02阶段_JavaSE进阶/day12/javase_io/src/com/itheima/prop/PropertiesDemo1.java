package com.itheima.prop;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    //演示：Properties作为集合
    public static void main(String[] args) {
        //创建对象
        Properties prop = new Properties();//不需要添加泛型。原因：通常Properties中存储的都是String类型

        prop.setProperty("java","Java进阶课程");
        prop.setProperty("mysql","mysql数据库");

        System.out.println(prop.getProperty("java"));

        Set<String> keys = prop.stringPropertyNames();
        System.out.println(keys);
    }
}
