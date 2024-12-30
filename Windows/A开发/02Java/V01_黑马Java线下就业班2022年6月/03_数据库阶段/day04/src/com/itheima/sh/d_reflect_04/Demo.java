package com.itheima.sh.d_reflect_04;

import java.lang.reflect.Method;
import java.util.ResourceBundle;
/*
    课下完成
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        //原来代码是：
        /*Cat cat = new Cat();
        cat.sleep();*/

        //使用反射执行Cat类的sleep
        //读取配置文件animal.properties中的数据
        ResourceBundle bundle = ResourceBundle.getBundle("animal");
        //根据key获取值
        String className = bundle.getString("className");//com.itheima.sh.d_reflect_04.Cat
        String methodName = bundle.getString("methodName");//sleep
        //1.获取Cat类的Class对象
//        Class<?> clazz = Class.forName("com.itheima.sh.d_reflect_04.Cat");
        Class<?> clazz = Class.forName(className);
        //2.获取类中的sleep方法
//        Method m = clazz.getMethod("sleep");
        Method m = clazz.getMethod(methodName);
        //3.执行sleep方法
        m.invoke(clazz.newInstance());
    }
}
