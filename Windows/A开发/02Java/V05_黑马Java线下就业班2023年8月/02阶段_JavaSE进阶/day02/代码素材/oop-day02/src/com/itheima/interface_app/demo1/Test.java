package com.itheima.interface_app.demo1;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.interface_app.demo1
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 17 22
 * @Since JDK 17.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        BasketBallBoy bb = new BasketBallBoy();
        bb.play();bb.study();
        BasketBallGirl bbg = new BasketBallGirl();
        bbg.play();
        bbg.study();
    }
}
