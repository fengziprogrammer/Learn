package com.itheima.static_app.trait;

public class Test1 {
    //测试：静态的成员变量可以实现数据共享
    public static void main(String[] args) {
        //创建对象
        StaticDemo sd1 = new StaticDemo();
        StaticDemo sd2 = new StaticDemo();
        StaticDemo sd3 = new StaticDemo();

        sd1.number++;
        sd2.number++;
        sd3.number++;
        //静态内容，通常是使用：类名调用
        System.out.println(StaticDemo.number);
    }
}
