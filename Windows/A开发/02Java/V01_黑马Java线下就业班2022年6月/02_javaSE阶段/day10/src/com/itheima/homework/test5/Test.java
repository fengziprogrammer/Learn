package com.itheima.homework.test5;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();

        Stream.concat(one.stream(), two.stream()).forEach(s -> System.out.println(new Person(s).toString()));

    }
}

class Person {
    public Person(String name) {

    }

}

