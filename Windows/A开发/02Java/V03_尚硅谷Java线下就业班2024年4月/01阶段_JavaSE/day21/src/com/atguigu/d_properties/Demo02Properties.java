package com.atguigu.d_properties;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class Demo02Properties {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        FileInputStream in = new FileInputStream("day21_IO_Net\\pro.properties");
        properties.load(in);
        Set<String> set = properties.stringPropertyNames();//好比是keySet()
        for (String key : set) {
            System.out.println(key+"..."+properties.getProperty(key));
        }
    }
}
