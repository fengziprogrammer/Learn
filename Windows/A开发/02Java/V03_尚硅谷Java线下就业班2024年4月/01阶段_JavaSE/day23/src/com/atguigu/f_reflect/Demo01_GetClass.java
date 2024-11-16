package com.atguigu.f_reflect;

public class Demo01_GetClass {
    public static void main(String[] args)throws Exception {
        /*
          1.方式1:
            new对象,用此对象调用Object中的getClass()方法
         */
        Person person = new Person();
        Class aClass1 = person.getClass();
        System.out.println("aClass1 = " + aClass1);
        System.out.println("======================");

        /*
        2.方式2:
            jvm为每个类型(基本,引用)都提供了一个静态成员 -> class
         */
        Class<Person> aClass2 = Person.class;
        System.out.println("aClass2 = " + aClass2);
        System.out.println("======================");

        /*
        3.方式3:使用Class类中的方法
            static Class forName(String 类的全限定名) -> 就是填写包名.类名
         */
        Class<?> aClass3 = Class.forName("com.atguigu.f_reflect.Person");
        System.out.println("aClass3 = " + aClass3);

        System.out.println("=====================");
        System.out.println(aClass1==aClass2);//true
    }
}
