package com.atguigu.c_list;

import java.util.ArrayList;

public class Demo03ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);//元素2存到了0索引上

        /*
          remove(2) -> 调用的是remove(int index) -> 按照索引删除元素

          解决:
            将2转成包装类
         */
        //list.remove(2);
        list.remove(new Integer(2));
        System.out.println(list);
    }
}
