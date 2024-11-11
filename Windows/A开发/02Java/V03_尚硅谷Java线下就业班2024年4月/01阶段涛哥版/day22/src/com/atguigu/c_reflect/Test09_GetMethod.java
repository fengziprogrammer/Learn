package com.atguigu.c_reflect;

import java.lang.reflect.Method;

public class Test09_GetMethod {
    public static void main(String[] args)throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        Method setName = personClass.getMethod("setName", String.class);

        /*
          相当于:person.setName("柳岩")
         */
        setName.invoke(person,"柳岩");
        System.out.println(person);

        System.out.println("================================================");

        Method getName = personClass.getMethod("getName");

        //好比是:Object o = person.getName()
        Object o = getName.invoke(person);
        System.out.println("o = " + o);
    }
}
