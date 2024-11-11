package com.atguigu.f_method;

import java.util.function.Function;

public class Demo04Method {
    public static void main(String[] args) {
        method(new Function<String, Person>() {
            /*
              a.apply方法有参数,类型为String,有返回值,返回值类型为Person
              b.Person有参构造,有参数,参数类型为String,有返回值(按照new对象来看),类型为Person
             */
            @Override
            public Person apply(String s) {
                return new Person(s);
            }
        },"zhangsan");

        System.out.println("======lambda=====");
        method(s -> new Person(s),"柳岩");

        System.out.println("=======方法引用=======");
        method(Person::new,"柳岩");
    }
    public static void method(Function<String,Person> function,String name){
        Person person = function.apply(name);
        System.out.println("person = " + person);
    }
}
