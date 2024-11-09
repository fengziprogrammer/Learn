package com.itheima.properties_demo;

import java.util.Properties;
import java.util.Set;

/*
    Properties作为集合的特有方法
        Object setProperty(String key, String value)	设置集合的键和值，都是String类型，相当于put方法
        String getProperty(String key)	使用此属性列表中指定的键搜索属性 , 相当于get方法
        Set<String> stringPropertyNames()	从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串 , 相当于keySet方法
 */
public class PropertiesDemo2 {
    public static void main(String[] args) {
        // 1 创建集合对象
        Properties properties = new Properties();

        // 2 添加数据
        // Object setProperty(String key, String value)	设置集合的键和值，都是String类型，相当于put方法
        properties.setProperty("it001" , "张三");
        properties.setProperty("it002" , "李四");
        properties.setProperty("it003" , "王五");

        // 3 遍历集合
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key + "--" + value);
        }
    }
}