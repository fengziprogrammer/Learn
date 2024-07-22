package com.atguigu.d_javabean;

public class Test01 {
    public static void main(String[] args) {
        //利用set方法赋值
        Person person1 = new Person();
        person1.setName("曼曼");
        person1.setAge(58);
        System.out.println(person1.getName()+"...."+person1.getAge());

        System.out.println("====================");

        //利用有参构造赋值
        Person person2 = new Person("三上", 26);
        System.out.println(person2.getName()+"...."+person2.getAge());
    }
}
