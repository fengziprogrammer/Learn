package com.atguigu.test;

import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.Properties;

public class TestProperties {
    @Test
    public void testRead() throws Exception{
        Properties properties = new Properties();
        // 通过类加载器读取字节码根路径下的文件
        InputStream in = TestProperties.class.getClassLoader().getResourceAsStream("jdbc.properties");
        // 读取配置文件中的信息
        properties.load(in);

        // 通过properties获取配置信息
        String driverClassName = properties.getProperty("driverClassName");
        System.out.println(driverClassName);
    }
}
