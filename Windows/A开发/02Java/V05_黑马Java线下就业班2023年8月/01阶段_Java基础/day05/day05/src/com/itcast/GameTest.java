package com.itcast;

public class GameTest {
    public static void main(String[] args) {
        //创建对象1: 空参+set
        Game g1 = new Game();
        g1.setName("王者荣耀");
        g1.setDeveloper("天美工作室");
        g1.setDate("2015年");
        g1.setType("MOBA");
        g1.setPlayers(10);
        g1.setGameScreen("3D");
        //展示对象1属性
        g1.show();

        System.out.println("------------------");

        //创建对象2: 带参
        Game g2 = new Game("地下城与勇士", "腾讯", "2006年", "格斗", 1, "2D");
        //展示对象2属性
        g2.show();


    }
}
