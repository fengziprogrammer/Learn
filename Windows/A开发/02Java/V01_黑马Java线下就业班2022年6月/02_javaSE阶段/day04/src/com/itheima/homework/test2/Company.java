package com.itheima.homework.test2;

// 公司类 实现类 发工资接口
public class Company implements Money {
    private double money;// 资金 , 用来给员工发工资

    public Company() {

    }

    public Company(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void pay(Employee employee) {// Employee employee = new Manager(20000, "李四")
        // 从公司总资金中扣除当前员工的工资
        money -= employee.getSalary(); // money = money -  employee.getSalary();
        System.out.println("给" + employee.getName() + "发工资" + employee.getSalary() + "元,公司剩余" + money + "元");
    }
}
