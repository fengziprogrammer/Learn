package com.atguigu.method;

public class TestGC {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "张三";
        e1.birthday = new MyDate();
        e1.setBirthday(1995,1,5);


    }


}
