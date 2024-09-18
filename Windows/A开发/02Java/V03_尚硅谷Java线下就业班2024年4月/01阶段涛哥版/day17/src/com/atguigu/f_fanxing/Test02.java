package com.atguigu.f_fanxing;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Integer -> Number -> Object
 *
 * String -> Object
 */
public class Test02 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();
        get1(list1);
        //get1(list2); //报错,String和Number么有关系
        get1(list3);
        //get1(list4);//报错,Object类型是Number的父类

        System.out.println("=================");

        //get2(list1);//报错,Integer是Number的子类
        //get2(list2);//报错,String和Number没有关系
        get2(list3);
        get2(list4);
    }

    //上限  ?只能接收extends后面的本类类型以及子类类型
    public static void get1(Collection<? extends Number> collection){

    }

    //下限  ?只能接收super后面的本类类型以及父类类型
    public static void get2(Collection<? super Number> collection){

    }
}
