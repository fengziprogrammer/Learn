package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

public class Test05_GetConstructor {
    public static void main(String[] args) throws Exception {
        Class<Person> class1 = Person.class;
        Constructor<Person> constructor = class1.getConstructor(String.class, Integer.class);
        System.out.println("constructor = " + constructor);

        /*
           好比是:Person person = new Person("柳岩",36);
         */
        Person person = constructor.newInstance("柳岩", 36);

        //好比是直接输出Person对象,默认调用toString
        System.out.println(person);
    }
}
