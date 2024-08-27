package com.atguigu.other;

import com.atguigu.bean.Student;
import com.atguigu.bean.Teacher;
import com.atguigu.bean.Worker;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo5_reflect {

    /*
    感受 反射的好处

    需求
    1.定义一个Student类,调用它的study()
    2.定义一个Teacher类,调用它的teach()
    3.定义一个Worker类,调用它的work()

    ... 50

    OOP设计原则
        开闭原则
            对扩展开放,对修改关闭
     */
    public static void main(String[] args) throws Exception {

        // new Student().eat();

       /* new Student().study();
        new Teacher().teach();
        new Worker().work();*/

        // 使用反射技术+ 配置文件 ,当前代码 随着需求的变更,代表不需要做任何的修改
        Properties properties = new Properties();
        InputStream is = Demo5_reflect.class.getClassLoader().getResourceAsStream("data.properties");
        properties.load(is);

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class class1 = Class.forName(className);// com.atguigu.bean.Studetn的字节码文件.class
        Object obj = class1.newInstance();
        // Method method = class1.getMethod(methodName);
        Method method = class1.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(obj);

    }
}
