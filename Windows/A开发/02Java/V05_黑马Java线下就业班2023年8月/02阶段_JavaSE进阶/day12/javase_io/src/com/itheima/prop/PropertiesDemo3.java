package com.itheima.prop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {
    //演示：使用Properties向配置文件中写入数据（了解）
    public static void main(String[] args) throws IOException {
        //创建对象
        Properties prop = new Properties();
        //存储元素
        prop.setProperty("username","admin");
        prop.setProperty("password","itheima");


        //把集合中的数据，写入到配置文件
        prop.store( new FileOutputStream("temp.properties"),"itheima");
    }
}
