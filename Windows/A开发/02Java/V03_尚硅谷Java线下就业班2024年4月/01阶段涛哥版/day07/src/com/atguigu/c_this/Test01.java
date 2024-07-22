package com.atguigu.c_this;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("柳岩");
        person.setAge(36);
        System.out.println(person.getName()+"..."+person.getAge());

        System.out.println("=================");

        Person person1 = new Person("金莲", 26);
        person1.setName("28");
        System.out.println(person1.getName()+"..."+person1.getAge());
    }
}
