package com.itheima.homework.work;
/*
    多态的用法 :
        1 多态变量
        2 参数多态
        3 返回值多态
 */
public class Test {
    public static void main(String[] args) {
        // 创建公司对象
        Company company = new Company(1000000);

        // 创建程序员对象
        Programmer programmer = new Programmer(15000 , "李晓亮");

        // 创建经理对象
        Manager manager = new Manager(28000 , "张小强");

        // 此方法需要一个Employee员工对象
        company.pay(programmer);
        company.pay(manager);


    }
}
