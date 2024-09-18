package com.atguigu.g_poker;

import java.util.ArrayList;
import java.util.Collections;

public class Poker2 {
    public static void main(String[] args) {
       //1.创建数组存储花色  color
        String[] color = "♠-♥-♣-♦".split("-");
        //System.out.println(color);
        //2.创建数组存储牌号  number
        String[] number = "2-3-4-5-6-7-8-9-10-J-Q-K-A".split("-");
        //System.out.println(number);

        //3.创建集合存储组合好的牌  poker
        ArrayList<String> poker = new ArrayList<>();
        //4.遍历color和number集合进行组合,存储到poker集合中
        for (String s1 : color) {
            for (String s2 : number) {
                poker.add(s1+s2);
            }
        }
        //System.out.println(poker);
        poker.add("☀");
        poker.add("🌙");

       //5.利用Collections.shuffle打乱poker集合
        Collections.shuffle(poker);
       /* 6.创建四个集合分别代表
        玩家1:player1
        玩家2:player2
        玩家3:player3
        底牌:dipai*/
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        //7.让poker的索引%3,取余数,根据不同的余数,决定存储到哪个玩家集合中
        for (int i = 0; i < poker.size(); i++) {
            String pai = poker.get(i);
            if (i>=51){
                dipai.add(pai);
            }else if(i%3==0){
                player1.add(pai);
            }else if(i%3==1){
                player2.add(pai);
            }else if(i%3==2){
                player3.add(pai);
            }
        }
        //8.遍历玩个玩家集合以及底牌集合

        System.out.println("曼曼:"+player1);
        System.out.println("涛哥:"+player2);
        System.out.println("柳岩:"+player3);
        System.out.println("底牌:"+dipai);
    }
}
