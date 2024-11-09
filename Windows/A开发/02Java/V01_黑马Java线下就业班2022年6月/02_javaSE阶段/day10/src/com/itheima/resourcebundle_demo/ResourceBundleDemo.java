package com.itheima.resourcebundle_demo;

import java.util.ResourceBundle;

/*
    1   java.util.ResourceBundle : 它是一个抽象类
        我们可以使用它的子类PropertyResourceBundle来读取以.properties结尾的配置文件

    2   static ResourceBundle getBundle(String baseName) 可以根据名字直接获取默认语言环境下的属性资源。
        参数注意: baseName
            1.属性集名称不含扩展名。
            2.属性集文件是在src目录中的
        比如：src中存在一个文件 user.properties
        ResourceBundle bundle = ResourceBundle.getBundle("user");

    3 ResourceBundle中常用方法：
         String getString(String key) : 通过键，获取对应的值

    优点 : 快速读取属性文件的值

     需求 :
        通过ResourceBundle工具类
        将一个属性文件 放到src目录中，使用ResourceBundle去获取键值对数据
 */
public class ResourceBundleDemo {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("user");
        // String getString(String key) : 通过键，获取对应的值
        String username = bundle.getString("username");
        System.out.println(username);

        System.out.println(ResourceBundle.getBundle("user").getString("password"));
    }
}