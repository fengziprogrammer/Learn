package com.itheima.homework.fourth;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.homework.fourth
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 19 01
 * @Since JDK 17.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.charge();
        Taxi t = new Taxi();
        t.charge();
        Cinema c = new Cinema();
        c.charge();
        c.play();
    }
}
