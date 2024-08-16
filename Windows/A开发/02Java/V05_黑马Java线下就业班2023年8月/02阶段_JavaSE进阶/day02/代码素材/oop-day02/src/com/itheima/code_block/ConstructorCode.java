package com.itheima.code_block;

import java.util.ArrayList;

//构造代码块
public class ConstructorCode {
    //集合对象
    ArrayList<String> list = new ArrayList<String>();

    //构造方法
    public ConstructorCode() {
        //初始化集合中的元素
        list.add("Java");
        list.add("MySQL");
        list.add("HTML");
    }

    public ConstructorCode(String str) {
        //初始化集合中的元素
        list.add("Java");
        list.add("MySQL");
        list.add("HTML");
        list.add(str);
    }
}
