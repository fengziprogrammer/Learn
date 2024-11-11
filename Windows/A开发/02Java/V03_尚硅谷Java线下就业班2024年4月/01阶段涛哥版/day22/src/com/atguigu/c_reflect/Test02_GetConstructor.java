package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

public class Test02_GetConstructor {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
