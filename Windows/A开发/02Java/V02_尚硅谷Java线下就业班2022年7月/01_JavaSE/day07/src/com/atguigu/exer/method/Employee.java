package com.atguigu.exer.method;

/*
（2）声明另一个Employee类型，

- 有属性：姓名（String类型），生日（MyDate类型）

- 增加一个void setBirthday(int year, int month, int day)方法，用于给员工生日赋值
- 增加一个String getEmpInfo()方法，用于返回员工对象信息，例如：姓名：xx，生日：xx年xx月xx日
 */
public class Employee {
    String name;
    MyDate birthday;
    //birthday是MyDate类型的变量，就可以调用MyDate类中的getDateInfo()


    //set：设置，修改
    void setBirthday(int year, int month, int day){
        birthday = new MyDate();
        birthday.year = year;
        birthday.month = month;
        birthday.day = day;
    }

    String getEmpInfo(){
        return "姓名：" + name +"，生日：" + birthday.getDateInfo();
    }
}
