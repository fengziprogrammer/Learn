package com.itheima.genericity_demo.wildcard_demo;

import java.util.ArrayList;

/*
    基于上一个知识点，定义方法
    show1方法，参数只接收元素类型是Number或者其父类型的集合
    show2方法，参数只接收元素类型是Number或者其子类型的集合
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Number> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();

        show1(list1);
        show1(list2);
//        show1(list3);
//        show1(list4);

//        show2(list1);
        show2(list2);
        show2(list3);
//        show2(list4);
    }

    // 此方法的参数是一个集合 , 集合的泛型是泛型的下限 , 只能接收Number类型或者Number的父类型
    public static void show1(ArrayList<? super Number> list){

    }
    // 此方法的参数是一个集合 , 集合的泛型是泛型的上限 , 只能接收Number类型或者Number的子类型
    public static void show2(ArrayList<? extends Number> list){

    }
}
