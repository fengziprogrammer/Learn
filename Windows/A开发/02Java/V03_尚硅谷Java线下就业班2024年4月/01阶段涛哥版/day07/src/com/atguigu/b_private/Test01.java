package com.atguigu.b_private;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person+".....person");
        person.name = "沉香";
        person.speak("刘彦昌");

        System.out.println("===============");

       Person person1 = new Person();
       System.out.println(person1+".........person1");
       person1.name = "哪吒";
       person1.speak("李靖");
    }
}
