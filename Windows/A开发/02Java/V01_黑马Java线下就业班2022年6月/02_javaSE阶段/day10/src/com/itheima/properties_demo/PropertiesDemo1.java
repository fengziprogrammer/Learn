package com.itheima.properties_demo;

import java.util.Properties;
import java.util.Set;

/*
    1 properties是一个Map体系的集合类
        - `public class Properties extends Hashtable <Object,Object>`

    2 为什么在IO流部分学习Properties
        - Properties中有跟IO相关的方法
    3 当做双列集合使用
        - 不需要加泛型 , 工作中只存字符串
 */
public class PropertiesDemo1 {
    public static void main(String[] args) {
        // 1 创建集合对象
        Properties properties = new Properties();

        // 2 添加数据
        properties.put("it001" , "张三");
        properties.put("it002" , "李四");
        properties.put("it003" , "王五");

        // 3 遍历集合
        Set<Object> set = properties.keySet();
        for (Object key : set) {
            Object value = properties.get(key);
            System.out.println(key + "---" + value);
        }
    }
}