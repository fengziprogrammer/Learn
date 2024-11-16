package com.atguigu.f_reflect;

import java.lang.reflect.Constructor;

public class Demo04_GetConstructor {
    public static void main(String[] args) throws Exception{
        Class<Person> aClass = Person.class;
        Constructor<Person> constructor = aClass.getConstructor();
        Person person = constructor.newInstance();//好比Person person = new Person()
        System.out.println(person);//好比是,直接输出person对象名,默认调用toString

        System.out.println("===================================");
        Constructor<Person> constructor1 = aClass.getConstructor(String.class, Integer.class);
        Person person1 = constructor1.newInstance("柳岩", 36);//好比是Person person = new Person("柳岩",36)
        System.out.println(person1);//好比是直接输出person对象名,默认调用toString
    }
}
