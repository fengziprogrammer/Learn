package com.atguigu.f_reflect;

import java.lang.reflect.Constructor;

public class Demo03_GetConstructor {
    public static void main(String[] args) {
        Class<Person> aClass = Person.class;
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
