package com.itheima.code_block;

import java.util.ArrayList;

//构造代码块
public class ConstructorCode {
    //集合对象
    ArrayList<String> list = new ArrayList<String>();

    //构造代码块
    {
        System.out.println("构造代码块~~~");
        //把构造方法中共性内容书写在构造代码块中
        list.add("Java");
        list.add("MySQL");
        list.add("HTML");
    }

    //构造方法
    public ConstructorCode() {
        //初始化集合中的元素
        System.out.println("无参构造方法");
    }

    public ConstructorCode(String str) {
        System.out.println("有参构造方法");
        //初始化集合中的元素
        list.add(str);
    }
}
