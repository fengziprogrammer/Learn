package com.atguigu.review;

public class TestOverload {
    double method(int a,double b){
        return a+b;
    }
    double method(double a, int b){
        return a+b;
    }
}
