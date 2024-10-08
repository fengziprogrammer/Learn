package com.atguigu.a_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Demo02Poker {
    public static void main(String[] args) {
        //1.创建数组,存储花色
        String[] color = "♠-♥-♣-♦".split("-");
        //2.创建数组,存储牌号
        String[] number = "2-3-4-5-6-7-8-9-10-J-Q-K-A".split("-");
        //3.创建HashMap存储牌面
        HashMap<Integer, String> pokerMap = new HashMap<>();
        //4.创建一个ArrayList集合,专门存储牌面对应的key
        ArrayList<Integer> list = new ArrayList<>();
        //5.组合牌,存储到Map集合中
        int key = 2;
        for (String s1 : number) {
            for (String s2 : color) {
                String poker = s2+s1;
                pokerMap.put(key,poker);
                list.add(key);
                key++;
            }
        }
        pokerMap.put(0,"大🃏");
        pokerMap.put(1,"小🃏");
        list.add(0);
        list.add(1);
        //System.out.println(pokerMap);

        //6.洗牌
        Collections.shuffle(list);
        //7.发牌
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        //7.让poker的索引%3,取余数,根据不同的余数,决定存储到哪个玩家集合中
        for (int i = 0; i < list.size(); i++) {
            Integer pai = list.get(i);
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
        //8.排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);

        //9.看牌
        lookPoker("柳岩",player1,pokerMap);
        lookPoker("曼曼",player2,pokerMap);
        lookPoker("涛哥",player3,pokerMap);
        lookPoker("底牌",dipai,pokerMap);
    }

    public static void lookPoker(String name,ArrayList<Integer> list,HashMap<Integer, String> map){
        System.out.print(name+": ");
        for (Integer key : list) {
            System.out.print(map.get(key)+" ");
        }
        System.out.println();
    }
}
