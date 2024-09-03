package com.itheima.homework.test3;

// 图形 接口
public interface ShapePara {
    // 获得图形的面积
    public abstract int getArea();

    // 获得图形的周长
    public abstract int getCircumference();
}

// 圆类 实现了 图形
class Circle implements ShapePara {
    // 该类含有一个静态常量
    public static final double PI = 3.14;

    // 圆的半径
    public double radius;

    // 有参构造方法
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    // 获取半径的值方法
    public double getRadius() {
        return radius;
    }

    // 设置半径的值方法
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 获得图形的面积
    @Override
    public int getArea() {
        // return (int) (PI * radius * radius);
        return (int) (PI * Math.pow(radius , 2));
    }

    // 获得图形的周长
    @Override
    public int getCircumference() {
        return (int) (PI * 2 * radius);
    }


}
