package com.atguigu.m_innerclass.t_design;

public class BenzFactory implements Factory{
    @Override
    public Car createCar() {
        return new Benz();
    }
}
