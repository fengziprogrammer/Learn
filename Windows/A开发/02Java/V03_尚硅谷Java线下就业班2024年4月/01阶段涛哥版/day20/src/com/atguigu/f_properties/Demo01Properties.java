package com.atguigu.f_properties;

import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("username","tom");
        properties.setProperty("password","1234");

        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key+"..."+value);
        }
    }
}
