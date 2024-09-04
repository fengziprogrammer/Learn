package com.atguigu.genericity;

import java.util.ArrayList;

public class Demo9 {

    /*
    什么时候需要使用泛型
        1> 定义时,不知道具体的类型是什么
        2> 当前这个类型一旦被明确,需要保持一致

        泛型  <类型>


        一个类 定义泛型
            class 类名<泛型类型>{}

            一个类的泛型的类型   确定的时机:  创建该类对象引用时
     */
    public static void main(String[] args) {

        ArrayList<String> list =  new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        System.out.println(list);

        ClassAA<String> classAA1 = new ClassAA<>();
        classAA1.method("aaa");
        classAA1.method("aaa");
        // classAA1.method(111);

    }
}


class ClassAA<A>{

    public void method(A a){
        System.out.println(a);
    }
}
