package com.itheima.interface_app.demo1;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.interface_app.demo1
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 17 20
 * @Since JDK 17.0
 * @Description
 */
public class BasketBallBoy extends Boy implements PlayBasketBall{
    @Override
    public void play() {
        System.out.println("男生打篮球");
    }
}
