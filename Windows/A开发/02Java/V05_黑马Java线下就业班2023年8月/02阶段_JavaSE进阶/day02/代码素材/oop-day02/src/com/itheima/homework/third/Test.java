package com.itheima.homework.third;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.homework.Third
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 18 56
 * @Since JDK 17.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(6.0);
        int area = c.getArea();
        System.out.println("circle area is "+area);
        int circumference = c.getCircumference();
        System.out.println("circle 周长是"+circumference);
    }
}
