package com.atguigu.c_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo04Lambda {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",50));
        list.add(new Person("李四",40));
        list.add(new Person("王五",60));
        list.add(new Person("赵六",30));
        list.add(new Person("田七",70));

        /*Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        Collections.sort(list, (o1,o2)-> o1.getAge()-o2.getAge());

        for (Person person : list) {
            System.out.println(person);
        }

    }
}
