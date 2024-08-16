package com.itheima.homework.fourth;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.homework.fourth
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 19 00
 * @Since JDK 17.0
 * @Description
 */
public class Bus implements Charge{
    @Override
    public void charge() {
        System.out.println("公共汽车：1元/张，不计公里数");
    }
}
