package com.itheima.genericity_demo.wildcard_demo;

import java.util.ArrayList;
import java.util.List;

/*
    泛型通配符搭配集合使用一般在方法的参数中比较常见
    方法中的参数是一个集合,集合如果携带了通配符，要特别注意如下：
    1  集合的类型会提升为Object类型。
    2  方法中的参数是一个集合,集合如果携带了通配符,那么此集合不能进行添加和修改操作 , 可以删除和获取
       在集合中泛型是不支持多态的，如果为了匹配任意类型，我们就会使用泛型通配符了。如下案例

    已知存在继承体系：Integer继承Number，Number继承Object。定义一个方法，方法的参数是一个ArrayList。
    要求可以接收ArrayList<Integer>,ArrayList<Number>,ArrayList<Object>,ArrayList<String>这些类型的数据
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Number> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();

        show(list1);
        show(list2);
        show(list3);
        show(list4);
    }

    // 泛型不支持多态
//    public static void show(ArrayList<Object> list) {
//
//    }

//    public static void show(ArrayList<?> list) {
//
//    }

    public static <E> void show(ArrayList<E> list) {

    }


    public static void useList(List<?> list) {
        // 1  集合的类型会提升为Object类型。
        Object o = list.get(0);

        //  2  方法中的参数是一个集合,集合如果携带了通配符,那么此集合不能进行添加和修改操作 , 可以删除和获取
        //       在集合中泛型是不支持多态的，如果为了匹配任意类型，我们就会使用泛型通配符了。如下案例
        // list.add("");
        // list.set(1 , ?);

        list.remove(1);

    }
}
