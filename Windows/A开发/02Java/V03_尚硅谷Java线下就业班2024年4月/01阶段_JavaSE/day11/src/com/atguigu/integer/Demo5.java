package com.atguigu.integer;

public class Demo5 {

    public static void main(String[] args) {
        // Integer i = 1000;
        // double j = 1000;
        // System.out.println(i==j);//true  会先将i自动拆箱为int，然后根据基本数据类型“自动类型转换”规则，转为double比较


        /*Integer i = 1000;
        int j = 1000;
        System.out.println(i==j);//true 会自动拆箱，按照基本数据类型进行比较
*/
        Integer i = 1;
        Double d = 1.0;
        // System.out.println(i==d);//编译报错 比较引用数据类型 前提:两个类型一致 (或子父类)
        System.out.println(new Cat() == new  Animal());
        // System.out.println(new Dog() == new  Animal());


    }
}

class Animal{}
class Cat extends  Animal{}
class Dog{}
