package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

public class Test07_GetConstructor {
    public static void main(String[] args)throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> ds = personClass.getDeclaredConstructor(String.class);

        //解除私有权限
        ds.setAccessible(true);

        Person person = ds.newInstance("曼曼");
        System.out.println(person);
    }
}
