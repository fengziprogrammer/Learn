package com.atguigu.h_lombok;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("柳岩");
        person.setAge(36);
        System.out.println(person.getName()+"..."+person.getAge());
        System.out.println(person);
        System.out.println("======================");

        Person person1 = new Person("曼曼", 18);
        System.out.println(person1);
    }
}
