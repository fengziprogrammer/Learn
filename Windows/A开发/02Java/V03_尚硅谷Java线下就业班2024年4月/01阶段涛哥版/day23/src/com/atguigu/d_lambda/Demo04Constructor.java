package com.atguigu.d_lambda;

import java.util.function.Function;

public class Demo04Constructor {
    public static void main(String[] args) {
        method(new Function<String, Person>() {

            /*
               apply:有一个String参数,返回值为Person类型

               new Person(s): 一个参数的有参构造,参数为String,返回值类型为Person类型

               Person p = new Person(s)
             */
            @Override
            public Person apply(String s) {
                return new Person(s);
            }
        },"柳岩");

        System.out.println("======Lambda======");
        method(s -> new Person(s),"曼曼");

        System.out.println("======方法引用=====");

        method(Person::new,"曼曼");
    }

    public static void method(Function<String,Person> function,String name){
        Person person = function.apply(name);
        System.out.println(person);
    }
}
