package com.atguigu.b_interface;

public class Test03 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog1 = new Dog("黑白", 2);
        Dog dog2 = new Dog("黑白", 2);
        System.out.println(dog1==dog2);//false
        System.out.println(dog1.equals(dog2));//true

        System.out.println("========================");

        Dog dog3 = new Dog("黄色", 3);

        Object o = dog3.clone();//相当于Dog dog4 = new Dog("黄色", 3);

        Dog dog4 = (Dog)o;//相当于Dog dog4 = new Dog("黄色", 3);

        System.out.println(dog3==dog4);

        System.out.println(dog3.equals(dog4));
    }
}
