package com.atguigu.a_homework;

public class Test02 {
    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        citizen.name = "涛哥";

        MyDate birthday = citizen.birthday;//仅仅是将属性获取出来,并没有真正为其赋值
        birthday = new MyDate();//为自定义类型赋值,其实就是new个对象给它

        birthday.year = 2020;
        birthday.month = 10;
        birthday.day = 10;

        citizen.cardId = "1111";

        System.out.println(citizen.name);
        System.out.println(birthday.year);
        System.out.println(birthday.month);
        System.out.println(birthday.day);
        System.out.println(citizen.cardId);
    }
}
