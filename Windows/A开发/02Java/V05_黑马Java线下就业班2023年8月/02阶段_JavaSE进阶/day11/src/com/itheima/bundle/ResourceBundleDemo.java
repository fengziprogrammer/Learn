package com.itheima.bundle;

import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        //获取对象 （作用：读取项目工程的src目录下的.properties配置文件）
        ResourceBundle rb = ResourceBundle.getBundle("itheima");//只需要指定配置文件的名字即可

        //获取配置文件中的value值
        String name = rb.getString("name");
        String password = rb.getString("password");
        System.out.println(name);
        System.out.println(password);
    }
}
