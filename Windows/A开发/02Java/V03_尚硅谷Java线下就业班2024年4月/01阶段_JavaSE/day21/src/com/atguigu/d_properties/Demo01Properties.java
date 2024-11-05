package com.atguigu.d_properties;

import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("username","root");
        properties.setProperty("password","root");
        Set<String> set = properties.stringPropertyNames();//好比是keySet()
        for (String key : set) {
            System.out.println(key+"..."+properties.getProperty(key));
        }
    }
}
