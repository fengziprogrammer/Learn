package com.atguigu.c_reflect;

public class Test01 {
    public static void main(String[] args)throws Exception {
        /*
          1.方式1:调用Object中的getClass()方法:
                  Class<?> getClass()
         */
        Person person = new Person();
        Class aClass = person.getClass();
        System.out.println("aClass = " + aClass);

        System.out.println("===================");

        //2.方式2:不管是基本类型还是引用类型,jvm都为其提供了一个静态成员:class
        Class<Person> aClass1 = Person.class;
        System.out.println("aClass1 = " + aClass1);

        System.out.println("===================");

        /*
         3.方式3:Class类中的静态方法:
               static Class<?> forName(String className)
                               className:类的全限定名(包名.类名)
         */
        Class<?> aClass2 = Class.forName("com.atguigu.c_reflect.Person");
        System.out.println("aClass2 = " + aClass2);

        System.out.println("===================");

        //System.out.println(aClass1==aClass2);

    }
}
