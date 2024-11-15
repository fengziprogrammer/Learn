package com.itheima.design_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
    装饰模式指的是在不改变原类, 不使用继承的基础上，动态地扩展一个对象的功能

    使用原则 :
        1. 装饰类和被装饰类需要有共同的父类型。
        2. 装饰类要传入被装饰类的对象
        3. 在装饰类中把要增强扩展的功能进行扩展
        4. 对于不要增强的功能直接调用


    需求 ： 在不改变LiuDeHua类，及不使用继承的技术前提下，动态的扩展LiuDeHua的sing功能。
            LiuDeHua就是一个被装饰类 , 需要对唱歌的功能进行扩展
    步骤：
        1. 创建LiuDeHua类并实现接口Star【被装饰类】
        2. 定义一个装饰类LiuDeHuaWrapper实现Star 【装饰类】
        3. 在装饰类里面定义一个成员变量类型是LiuDeHua，可以使用构造方法进行传入被装饰类对象。
        4. 在装饰类中对sing方法进行功能扩展
        5. 对dance不做改动
        6. 测试类分别创建装饰类的对象和被装饰类的对象。将被装饰类对象刘德华对象设置给装饰类对象
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //  6. 测试类分别创建装饰类的对象和被装饰类的对象。将被装饰类对象刘德华对象设置给装饰类对象

        // 创建的是被装饰类对象
        LiuDeHua huaZai = new LiuDeHua();
        // 创建装饰类对象 , 需要把被装饰类的对象作为参数传递给装饰类的构造方法中
        LiuDeHuaWrapper wrapper = new LiuDeHuaWrapper(huaZai);
        wrapper.sing();
        wrapper.dance();

    }
}

// 明星接口 , 装饰类和被装饰类的父类型
interface Star {
    public abstract void sing(); // 唱歌

    public abstract void dance();// 跳舞
}

// 1. 创建LiuDeHua类并实现接口Star【被装饰类】
class LiuDeHua implements Star {
    @Override
    public void sing() {
        System.out.println("忘情水...");
    }

    @Override
    public void dance() {
        System.out.println("华仔跳霹雳舞...");
    }
}

// 2. 定义一个装饰类LiuDeHuaWrapper实现Star 【装饰类】
class LiuDeHuaWrapper implements Star {
    // 3. 在装饰类里面定义一个成员变量类型是LiuDeHua，可以使用构造方法进行传入被装饰类对象。
    private LiuDeHua huaZai;

    public LiuDeHuaWrapper(LiuDeHua huaZai) {
        this.huaZai = huaZai;
    }

    @Override
    public void sing() {
        // 4. 在装饰类中对sing方法进行功能扩展
        System.out.println("华仔正在深情的唱");
        huaZai.sing();
    }

    @Override
    public void dance() {
        huaZai.dance();
    }
}