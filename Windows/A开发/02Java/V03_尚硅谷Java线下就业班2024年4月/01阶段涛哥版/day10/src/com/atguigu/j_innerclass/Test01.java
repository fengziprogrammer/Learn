package com.atguigu.j_innerclass;

public class Test01 {
    public static void main(String[] args) {
        Person.Heart heart = new Person().new Heart();
        heart.jump();

        System.out.println("============================");

        Student.Heart heart1 = new Student().new Heart();
        heart1.display("李四");
    }
}
