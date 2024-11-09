package com.itheima.properties_demo;

import java.io.*;
import java.util.Properties;

/*
   2 和IO流结合的方法
        void load(InputStream inStream) : 以字节流形式 , 把文件中的键值对, 读取到集合中
        // void load(Reader reader)	以字符流形式 , 把文件中的键值对, 读取到集合中
        void store(OutputStream out, String comments)	把集合中的键值对,以字节流形式写入文件中 , 参数二为注释
        // void store(Writer writer, String comments)	把集合中的键值对,以字符流形式写入文件中 , 参数二为注释
 */
public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        // 1 创建集合对象
        Properties properties = new Properties();

        // 2 添加数据
        // Object setProperty(String key, String value)	设置集合的键和值，都是String类型，相当于put方法
        properties.setProperty("it001" , "zhangsan");
        properties.setProperty("it002" , "lisi");
        properties.setProperty("it003" , "wangwu");

        //  void store(OutputStream out, String comments)	把集合中的键值对,以字节流形式写入文件中 , 参数二为注释
        properties.store(new FileOutputStream("day10_demo\\test.properties") , null );
    }

    private static void method() throws IOException {
        // 1 创建集合对象
        Properties properties = new Properties();
        // void load(InputStream inStream) : 以字节流形式 , 把文件中的键值对, 读取到集合中
        properties.load(new BufferedInputStream(new FileInputStream("day10_demo\\test.properties")));
        System.out.println(properties);// {it001=zhangsan}
    }
}