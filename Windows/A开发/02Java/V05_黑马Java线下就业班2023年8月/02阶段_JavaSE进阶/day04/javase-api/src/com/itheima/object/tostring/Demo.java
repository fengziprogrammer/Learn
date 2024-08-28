package com.itheima.object.tostring;


import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //集合
        ArrayList<String> list = new ArrayList<String>();
        //存储元素
        list.add("Java");
        list.add("MySQL");
        //打印：集合
        System.out.println(list); //list是对象。  直接在控制台输出集合中所有的元素
        //原因：ArrayList集合中，有针对Object类中的toString方法，进行重写

        String str = "上海黑马";
        System.out.println(str);//String类有针对Object中的toString方法，进行重写



        System.out.println("-=========--------------------------");

        //创建对象
        Student stu = new Student("张三",22);
        System.out.println(stu);//stu也是对象。  打印是内存地址
        //问题：如果想要打印Student对象中的成员信息，怎么办呢？
        //答案：重写Object类中的toString方法

    }
}
