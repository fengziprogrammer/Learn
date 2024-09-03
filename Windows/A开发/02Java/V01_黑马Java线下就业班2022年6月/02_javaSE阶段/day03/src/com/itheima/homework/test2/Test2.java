package com.itheima.homework.test2;

/*
    1. 请定义“员工(类)”：
       属性：姓名、性别、年龄(全部私有)
       行为：工作(抽象)
       无参、全参构造方法
       get/set方法

2. 请定义“绘画(接口)”
   抽象方法：绘画
3. 请定义“Java讲师类”继承自“员工类”
4. 请定义”UI讲师类”，继承自“员工类”，并实现“绘画”接口。

**要求**：

1. 请按上述要求设计出类结构，并实现相关的方法。
2. 测试类中创建对象测试，属性可自定义：
   - 创建一个Java讲师类对象，调用工作的方法。
   - 创建一个UI讲师类对象，调用工作方法，和绘画方法。
 */
public class Test2 {
    public static void main(String[] args) {
        JavaTeacher javaTeacher = new JavaTeacher("柳岩", "女", 18);
        System.out.println(javaTeacher.getName() + "--" + javaTeacher.getSex() + "--" + javaTeacher.getAge());
        javaTeacher.work();

        UITeacher uiTeacher = new UITeacher("景甜", "女", 18);
        System.out.println(uiTeacher.getName() + "--" + uiTeacher.getSex() + "--" + uiTeacher.getAge());
        uiTeacher.work();
        uiTeacher.paint();
    }
}
