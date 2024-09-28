package com.itheima.doudizhu;

import java.util.*;

/*
    按照斗地主的规则，完成洗牌发牌的动作。
    要求完成以下功能：

    准备牌：组装54张扑克牌

    洗牌：54张牌顺序打乱

    发牌：三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。

    看牌：查看三人各自手中的牌（按照牌的大小排序）、底牌

    规则：手中扑克牌从大到小的摆放顺序：大王,小王,2,A,K,Q,J,10,9,8,7,6,5,4,3

    把代码抽取到方法中 : 选中代码 ctrl + alt + m
 */
public class DouDiZhu {
    public static void main(String[] args) {
        // 第一步 : 准备牌
        // 创建Map集合对象
        LinkedHashMap<Integer, String> pokers = new LinkedHashMap<>();
        pokers.put(0, "大王");
        pokers.put(1, "小王");
        int count = 2;// 编号
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        for (String number : numbers) {
            for (String color : colors) {
                // System.out.println(color + number);
                pokers.put(count, color + number);
                count++;
            }
        }

        // {0=大王, 1=小王, 2=♥2, 3=♠2, 4=♦2, 5=♣2, 6=♥A, 7=♠A, 8=♦A, 9=♣A, 10=♥K, 11=♠K, 12=♦K, 13=♣K, 14=♥Q, 15=♠Q, 16=♦Q, 17=♣Q, 18=♥J, 19=♠J, 20=♦J, 21=♣J, 22=♥10, 23=♠10, 24=♦10, 25=♣10, 26=♥9, 27=♠9, 28=♦9, 29=♣9, 30=♥8, 31=♠8, 32=♦8, 33=♣8, 34=♥7, 35=♠7, 36=♦7, 37=♣7, 38=♥6, 39=♠6, 40=♦6, 41=♣6, 42=♥5, 43=♠5, 44=♦5, 45=♣5, 46=♥4, 47=♠4, 48=♦4, 49=♣4, 50=♥3, 51=♠3, 52=♦3, 53=♣3}
        System.out.println(pokers);

        // 第二步 : 洗牌
        Set<Integer> set = pokers.keySet();
        // 集合中存储的是所有的序号
        ArrayList<Integer> integers = new ArrayList<>(); // {54张牌的序号}
        // 把一个集合中所有的内容添加到另外一个集合中 , 属于Collection接口中
        integers.addAll(set);

        // shuffle只能对list集合乱序
        Collections.shuffle(integers);
        // [7, 17, 38, 12, 28, 4, 13, 6, 20, 26, 3, 0, 21, 9, 45, 41, 49, 53, 27, 16, 8, 11, 47, 5, 10, 18, 46, 51, 24, 23, 22, 30, 31, 44, 29, 32, 34, 39, 36, 19, 37, 48, 50, 1, 15, 43, 2, 35, 14, 25, 42, 40, 52, 33]
        System.out.println(integers);

        // 第三步 : 发牌
        TreeSet<Integer> 赌圣 = new TreeSet<>();
        TreeSet<Integer> 赌侠 = new TreeSet<>();
        TreeSet<Integer> 赌神 = new TreeSet<>();
        TreeSet<Integer> 底牌 = new TreeSet<>();

        for (int i = 0; i < integers.size() - 3; i++) {
            if (i % 3 == 0) {
                // 赌圣
                赌圣.add(integers.get(i));
            } else if (i % 3 == 1) {
                // 赌侠
                赌侠.add(integers.get(i));
            } else {
                // 赌神
                赌神.add(integers.get(i));
            }
        }

        底牌.add(integers.get(51));
        底牌.add(integers.get(52));
        底牌.add(integers.get(53));

        // 第四步 : 看牌
        lookPokers(pokers, 赌圣, "赌圣: [");
        lookPokers(pokers, 赌侠, "赌侠: [");
        lookPokers(pokers, 赌神, "赌神: [");
        lookPokers(pokers, 底牌, "底牌: [");
    }

    private static void lookPokers(LinkedHashMap<Integer, String> pokers, TreeSet<Integer> 玩家, String name) {
        System.out.print(name);
        for (Integer number : 玩家) {
            // 根据序号拿到对应的牌面值
            String s = pokers.get(number);
            System.out.print(s + "\t");
        }
        System.out.println("]");
    }
}
