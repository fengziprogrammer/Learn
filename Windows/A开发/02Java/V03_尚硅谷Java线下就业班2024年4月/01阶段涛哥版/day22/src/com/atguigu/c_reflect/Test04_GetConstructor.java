package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

public class Test04_GetConstructor {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        System.out.println(person);
    }
}
