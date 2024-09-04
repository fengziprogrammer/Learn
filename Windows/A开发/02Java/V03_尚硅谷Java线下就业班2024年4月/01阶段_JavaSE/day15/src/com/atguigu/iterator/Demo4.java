package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo4 {

    /*
        迭代器
            Collection上特有的遍历方式
            1> 创建对象
            2> 使用对象
     */
    public static void main(String[] args) {

        ArrayList<String> list2 = new ArrayList();
        list2.add("aa");
        list2.add("bbb");
        list2.add("cc");
        System.out.println(list2);

        // 获取迭代器
        Iterator<String> it = list2.iterator();
        while(it.hasNext()){//
            // System.out.println(it.next());
            String s = it.next();
            System.out.println(s);//
        }

    }
}
