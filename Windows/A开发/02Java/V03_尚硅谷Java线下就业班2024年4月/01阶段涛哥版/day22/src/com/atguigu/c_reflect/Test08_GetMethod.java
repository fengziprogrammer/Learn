package com.atguigu.c_reflect;

import java.lang.reflect.Method;

public class Test08_GetMethod {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
