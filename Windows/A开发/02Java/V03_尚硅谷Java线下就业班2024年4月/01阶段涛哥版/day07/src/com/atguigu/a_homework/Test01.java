package com.atguigu.a_homework;

public class Test01 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        myDate.year = 2000;
        myDate.month = 10;
        myDate.day = 10;

        System.out.println(myDate.year+"年"+ myDate.month+"月"+ myDate.day+"日");
    }
}
