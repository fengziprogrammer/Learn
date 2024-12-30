package com.itheima.sh.b_classloader_02;

import java.util.Properties;

/*
    读取src下面的配置文件内容
 */
public class ClassLoaderDemo02 {
    public static void main(String[] args) throws Exception{
        //1.创建属性集对象
        Properties p = new Properties();
        //2.使用对象p调用load方法加载配置文件stu.ini
//        p.load(new FileInputStream("src\\stu.ini"));基本流读取配置文件
        //使用类加载器方式关联src下面的配置文件
        //2.1获取当前类的Class对象
//        Class clazz = ClassLoaderDemo02.class;
        //2.2获取类加载器
//        ClassLoader classLoader = clazz.getClassLoader();
        //2.3使用classLoader调用ClassLoader类中方法关联src下面的配置文件stu.ini
        // InputStream getResourceAsStream(String name)返回读取指定资源的输入流。
        //参数：name 书写的关联配置文件路径，如果是相对路径相对的是src
//        InputStream is = classLoader.getResourceAsStream("stu.ini");//不用书写src
//        p.load(is);
        p.load(ClassLoaderDemo02.class.getClassLoader().getResourceAsStream("stu.ini"));
        //3.取出对象p中的数据
        //String getProperty(String key)用指定的键在此属性列表中搜索属性。
        String name = p.getProperty("name");//参数中的name是stu.ini中的key zhangsan
        String age = p.getProperty("age");//20
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
