package com.atguigu.f_reflect;

import java.lang.reflect.Constructor;

public class Demo05_GetConstructor {
    public static void main(String[] args) throws Exception{
        Class<Person> aClass = Person.class;
        Person person = aClass.newInstance();
        System.out.println(person);
    }
}
