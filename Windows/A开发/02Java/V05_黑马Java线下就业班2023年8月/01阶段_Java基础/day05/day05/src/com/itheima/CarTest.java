package com.itheima;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("奔驰",100000);
        System.out.println(c1.getBrand()+","+c1.getPrice());
        Car c2 = new Car();
    }
}
