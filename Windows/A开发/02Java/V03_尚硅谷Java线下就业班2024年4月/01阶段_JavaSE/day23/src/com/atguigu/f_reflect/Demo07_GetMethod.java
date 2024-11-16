package com.atguigu.f_reflect;

import java.lang.reflect.Method;

public class Demo07_GetMethod {
    public static void main(String[] args)throws Exception {
        //method01();
        method02();
    }

    private static void method02()throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();//好比是Person person = new Person()
        Method method = personClass.getMethod("setName", String.class);
        method.invoke(person,"柳岩");//好比是person.setName("柳岩")
        System.out.println(person);

        System.out.println("===============================");
        Method method1 = personClass.getMethod("getName");
        Object o = method1.invoke(person);
        System.out.println(o);

    }

    private static void method01() {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
