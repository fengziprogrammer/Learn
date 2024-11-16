package com.atguigu.f_reflect;

import java.lang.reflect.Constructor;

public class Demo06_GetConstructor {
    public static void main(String[] args)throws Exception {
        //method01();
        method02();
    }

    private static void method02() throws Exception{
        Class<Person> personClass = Person.class;
        Constructor<Person> dc = personClass.getDeclaredConstructor(String.class);
        //解除私有权限 -> 暴力反射
        dc.setAccessible(true);
        Person person = dc.newInstance("张三");
        System.out.println("person = " + person);
    }

    private static void method01() {
        Class<Person> personClass = Person.class;
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }
}
