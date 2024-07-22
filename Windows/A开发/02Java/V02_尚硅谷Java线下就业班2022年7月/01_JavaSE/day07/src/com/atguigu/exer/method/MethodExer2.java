package com.atguigu.exer.method;

public class MethodExer2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "张三";
        e1.birthday = new MyDate();
        e1.setBirthday(1995,5,1);
        System.out.println(e1.getEmpInfo());

        Employee e2 = new Employee();
        e2.name = "李四";
        e2.birthday = new MyDate();
        e2.setBirthday(2000,1,1);
        System.out.println(e2.getEmpInfo());
    }
}
