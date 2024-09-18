package com.atguigu.j_hashset;

import java.util.HashSet;

public class Demo01HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");//96354
        set.add("通话");//1179395
        set.add("重地");//1179395
        set.add("abc");//96354
        System.out.println(set);
    }
}
