package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

public class Test06_GetConstructor {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }
}
