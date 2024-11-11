package com.itheima.factory;

import org.junit.Before;
import org.junit.Test;

import java.util.ResourceBundle;

public class CarFactoryTest {

    String beanName=null;

    @Before
    public void init(){
        System.out.println("在@Test注解的方法之前执行");
        //读取bean.properties配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("bean");
        beanName = bundle.getString("name");
    }


    @Test
    public void methodTest() {
        System.out.println("methodTest");
        //调用工厂中的静态方法，获取对象
        Car car = CarFactory.getInstance(beanName);
        car.run();
    }

    @Test
    public void methodTest2(){
        System.out.println("methodTest2");
        //调用工厂中的静态方法，获取对象
        Car car = CarFactory.getInstance(beanName);
    }


}
