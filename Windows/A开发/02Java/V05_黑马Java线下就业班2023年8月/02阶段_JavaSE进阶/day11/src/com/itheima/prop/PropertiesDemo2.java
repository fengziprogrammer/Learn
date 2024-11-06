package com.itheima.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
    //演示：使用Properties读取配置文件
    public static void main(String[] args) throws IOException {
        //创建对象
        Properties prop = new Properties();

        //读取：itheima.properties配置文件
        prop.load( new FileInputStream("itheima.properties") );


        System.out.println(prop);
    }
}
