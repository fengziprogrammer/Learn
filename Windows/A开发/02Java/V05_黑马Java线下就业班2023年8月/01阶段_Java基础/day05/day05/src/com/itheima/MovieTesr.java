package com.itheima;
/*
    测试类
        1.创建对象
        2.赋值
        3.调用方法
 */
public class MovieTesr {
    public static void main(String[] args) {
        //1.创建对象: 空参+set完成赋值
        Movie m1 = new Movie();
        m1.setName("阿凡达");
        m1.setType("科幻");
        m1.setDirector("詹姆斯卡梅隆");
        m1.show();

        //2.创建对象: 带参,直接创建对象并赋值
        Movie m2 = new Movie("战狼","动作","吴京");
        m2.show();
    }
}
