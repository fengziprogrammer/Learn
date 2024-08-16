package com.itheima.interface_app.demo;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.interface_app.demo
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 15 16
 * @Since JDK 17.0
 * @Description
 */
public interface Player {
    public default void test(){
        System.out.println("测试下接口中的默认方法");
    }
    void play();
    void pause();
    void stop();
}
