package com.atguigu.f_properties;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class Demo02Properties {
    public static void main(String[] args)throws Exception {
        FileInputStream in = new FileInputStream("day20_IO\\pro.properties");
        Properties properties = new Properties();
        properties.load(in);

        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key+"..."+value);
        }
    }
}
