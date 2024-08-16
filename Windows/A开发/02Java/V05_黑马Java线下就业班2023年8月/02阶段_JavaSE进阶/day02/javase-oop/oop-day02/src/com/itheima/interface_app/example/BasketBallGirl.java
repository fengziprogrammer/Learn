package com.itheima.interface_app.example;

//篮球女孩（子类）
public class BasketBallGirl extends Girl implements PlayBasketBall{

    @Override
    public void playBasketBall(){
        System.out.println("女篮同学 打球");
    }
}
