package com.itheima.homework.work;

// 公司类
public class Company implements Money {
    private double money;// 总资金

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

    // 发工资的方法
    @Override
    public void pay(Employee e) {// Employee e = 程序员|经理
        // money -= e.getSalary()  // money  = money - e.getSalary();
        money -= e.getSalary();
        System.out.println("给" + e.getName() + "发工资,发了" + e.getSalary() + " , 公司还剩" + money);
    }
}
