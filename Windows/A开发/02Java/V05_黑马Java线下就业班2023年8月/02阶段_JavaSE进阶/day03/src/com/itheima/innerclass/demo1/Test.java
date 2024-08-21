package com.itheima.innerclass.demo1;

public class Test {
    public static void main(String[] args) {
        //创建Person类对象
        Person p = new Person();

        //创建成员内部类对象
        Person.Heart heart = p.new Heart();

        heart.beats();
    }
}
