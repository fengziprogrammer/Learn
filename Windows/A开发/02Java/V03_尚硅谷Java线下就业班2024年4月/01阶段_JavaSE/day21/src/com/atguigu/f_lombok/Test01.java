package com.atguigu.f_lombok;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(10);
        System.out.println(person.getName()+"..."+person.getAge());

        System.out.println("=================");

        Person person1 = new Person("涛哥", 18);
        System.out.println(person1.getName()+"..."+person1.getAge());
    }
}
