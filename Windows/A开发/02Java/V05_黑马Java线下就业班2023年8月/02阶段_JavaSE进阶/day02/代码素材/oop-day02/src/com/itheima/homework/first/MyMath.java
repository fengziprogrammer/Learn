package com.itheima.homework.first;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.homework
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 18 09
 * @Since JDK 17.0
 * @Description
 */
public final class MyMath {
    private MyMath() {

    }

    public static final double PI = 3.14;

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public static int getMin(int a, int b) {
        return a < b ? a : b;
    }
}
