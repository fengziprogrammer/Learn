package com.itheima.object.equals;

public class Test {
    //演示：equals方法
    public static void main(String[] args) {
      //创建第1个Phone对象
        Phone p1 = new Phone("小米",1999);//只要使用new，就是一个新的对象
        Phone p2 = new Phone("小米",1999);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("-------------------------------");

        System.out.println( p1 == p2); // == 比较的是变量中存储的数据值 、 比较的是对象中存储的地址值

        System.out.println(p1.equals(p2));//Ojbect类中的equals方法，比较的是对象中存储的地址值

        //当希望比较的是Phone对象中存储的数据时：在Phone中重写equals方法
    }
}
