package com.itheima.changeparameter_demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    Collections的addAll方法
        static <T> boolean  addAll( Collection<T> c  ,  T  elements ) : 添加任意多个数据到集合中
        分析： 该方法就是一个含有可变参数的方法，使用时可以传入任意多个实参，实用方便！

        练习：创建一个List集合，使用addAll方法传入若干字符串
 */
public class VariableDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //  static <T> boolean  addAll( Collection<T> c  ,  T  elements ) : 添加任意多个数据到集合中
        // Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        addElements(list, 1, 2, 3, 4, 5);

        System.out.println(list);
    }

    public static <T> void addElements(Collection<T> c, T... elements) {
        for (T element : elements) {
            c.add(element);
        }
    }
}
