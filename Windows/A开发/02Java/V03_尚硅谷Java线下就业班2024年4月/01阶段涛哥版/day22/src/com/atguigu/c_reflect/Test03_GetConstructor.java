package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

public class Test03_GetConstructor {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor();
        System.out.println("constructor = " + constructor);
        /*
          好比是: Person person = new Person();
         */
        Person person = constructor.newInstance();

        //好比是:直接输出对象名,默认调用toString
        System.out.println(person);
    }
}
