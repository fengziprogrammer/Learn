package com.itheima.interface_app.example;

public class Test {
    public static void main(String[] args) {
        //创建男学习同学
        StudyBoy studyBoy = new StudyBoy();
        studyBoy.study();

        //创建男篮同学
        BasketBallBoy basketBallBoy = new BasketBallBoy();
        basketBallBoy.study();
        basketBallBoy.playBasketBall();
    }
}
