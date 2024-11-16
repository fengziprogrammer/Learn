package com.atguigu.a_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo02Lambda {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",10));
        list.add(new Person("李四",8));
        list.add(new Person("王五",9));

        /*Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        Collections.sort(list, (Person o1, Person o2)-> {
                return o1.getAge()-o2.getAge();
        });

        System.out.println("============Lambda表达式终极形式================");

        Collections.sort(list, (o1,o2)-> o1.getAge()-o2.getAge());

        System.out.println(list);
    }
}
