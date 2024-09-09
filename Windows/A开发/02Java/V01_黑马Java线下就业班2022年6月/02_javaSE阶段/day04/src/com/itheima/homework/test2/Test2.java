package com.itheima.homework.test2;

import java.util.Properties;

/*
    模拟公司给员工发工资，代码实现，执行效果如图所示：


    参考下面的继承结构图完成相关代码的设计：
    1、程序员和经理都属于员工，使用继承完成相关类的设计

    2、员工作为父类，为其提供带参的构造函数，子类的有参构造需调用父类的有参构造

    3、创建接口Money，定义发工资功能，为员工发工资。

    4、公司类中定义总资金属性，实现Money接口，通过总资金扣除员工的工资，得出发工资后工资剩余的总资金

    5、创建测试类，在main方法中创建经理对象，程序员对象，及公司对象。调用方法给经理和程序员发工资。
*/
public class Test2 {
    public static void main(String[] args) {
        // 创建公司对象
        Company company = new Company(1000000); // 一百万

        //员工: 程序员
        Programmer programmer = new Programmer(10000, "张三");

        // 员工: 经理
        Manager manager = new Manager(20000, "李四");

        company.pay(programmer);

        company.pay(manager);
    }
}
