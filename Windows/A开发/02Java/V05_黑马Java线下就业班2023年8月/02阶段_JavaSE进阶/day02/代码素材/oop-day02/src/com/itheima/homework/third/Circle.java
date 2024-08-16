package com.itheima.homework.third;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.homework.Third
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 18 53
 * @Since JDK 17.0
 * @Description
 */
public class Circle implements ShapePara{
    public static final double PI = 3.14;
    public double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int)(PI*radius*radius);
    }

    @Override
    public int getCircumference() {
        return (int)(2*PI*radius);
    }
}
