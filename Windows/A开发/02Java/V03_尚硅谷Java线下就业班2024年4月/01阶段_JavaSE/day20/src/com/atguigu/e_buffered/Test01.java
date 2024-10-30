package com.atguigu.e_buffered;

import java.util.ArrayList;
import java.util.Collections;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("c.举头望明月");
        list.add("d.低头思故乡");
        list.add("a.床前明月光");
        list.add("b.疑是地上霜");

        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
