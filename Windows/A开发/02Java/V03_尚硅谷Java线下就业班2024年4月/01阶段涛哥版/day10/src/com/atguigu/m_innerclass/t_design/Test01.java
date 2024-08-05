package com.atguigu.m_innerclass.t_design;

public class Test01 {
    public static void main(String[] args) {
        BenzFactory benzFactory = new BenzFactory();
        Car car = benzFactory.createCar();
        car.drive();

        BmwFactory bmwFactory = new BmwFactory();
        Car car1 = bmwFactory.createCar();
        car1.drive();
    }
}
