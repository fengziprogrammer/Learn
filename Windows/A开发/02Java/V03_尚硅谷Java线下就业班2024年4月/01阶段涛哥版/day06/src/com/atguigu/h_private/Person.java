package com.atguigu.h_private;

public class Person {
    private String name;
    private int age;

    //针对name提供set方法
    public void setName(String xingMing) {

        name = xingMing;
    }

    //针对name提供get方法
    public String getName() {
        return name;
    }

    //针对age提供set方法
    public void setAge(int nianLing) {
        if (nianLing < 0 || nianLing > 120) {
            System.out.println("年龄不合理,归0");
            age = 0;
        } else {
            age = nianLing;

        }
    }

    //针对age提供get方法
    public int getAge() {

        return age;
    }
}
