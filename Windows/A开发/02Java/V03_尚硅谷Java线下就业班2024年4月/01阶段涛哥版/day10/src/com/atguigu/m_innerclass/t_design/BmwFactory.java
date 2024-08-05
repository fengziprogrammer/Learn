package com.atguigu.m_innerclass.t_design;

public class BmwFactory implements Factory{
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
