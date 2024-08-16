package com.itheima.interface_app.example;

//篮球男孩
public class BasketBallBoy extends Boy implements PlayBasketBall {
    @Override  //重写接口中的抽象方法
    public void playBasketBall(){
        System.out.println("男篮同学 打球");
    }
}
