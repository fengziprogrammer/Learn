package com.atguigu.d_foreach;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo02For {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("唐三藏");
        list.add("孙悟空");
        list.add("猪悟能");
        list.add("沙悟净");
        for (String s : list) {
            if ("猪悟能".equals(s)){
                list.add("白龙马");
            }
        }
        System.out.println(list);
    }
}
