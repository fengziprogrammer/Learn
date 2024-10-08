package com.atguigu.d_vector.e_properties;

import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("username","root");
        properties.setProperty("password","root");
        System.out.println(properties);

        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key+"..."+value);
        }
    }
}
