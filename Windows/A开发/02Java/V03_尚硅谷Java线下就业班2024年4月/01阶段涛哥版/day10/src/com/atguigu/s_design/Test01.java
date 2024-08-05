package com.atguigu.s_design;

public class Test01 {
    public static void main(String[] args) {
        Car benz = CarFactory.createCar("benz");
        benz.drive();

        Car bmw = CarFactory.createCar("bmw");
        bmw.drive();

        Car qq = CarFactory.createCar("QQ");
        qq.drive();
    }
}
