package com.atguigu.h_private;

public class Test02 {
    public static void main(String[] args) {
        Person person = new Person();
        //person.name = "柳岩";
        //person.age = -36;

        //System.out.println(person.name+"..."+person.age);
        person.setName("柳岩");
        person.setAge(-36);

        String name = person.getName();
        int age = person.getAge();
        System.out.println(name+"..."+age);
    }
}
