package com.itheima.innerclass.demo2;

public class Test {
    public static void main(String[] args) {
        Person.Heart heart = new Person().new Heart();
        heart.beats();
    }
}
