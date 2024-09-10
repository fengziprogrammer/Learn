package com.atguigu.d_foreach;

import java.util.ArrayList;

public class Demo01For {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张翠山");
        list.add("张大彪");
        list.add("李云龙");
        list.add("楚云飞");
        list.add("魏大勇");
        list.add("秀琴大妹子");
        list.add("二营长");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("==============");

        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
