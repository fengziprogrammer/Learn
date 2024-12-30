package com.itheima.sh.c_class_03;

/*
     获取某个类的Class对象三种方式
        1.类名.class
        2.Class.forName("类的全路径");
        3.对象名.getClass()
*/
public class ClassDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.类名.class  掌握
        Class clazz = ClassDemo01.class;
//        System.out.println("clazz = " + clazz);
        /*
            Class 类中的方法：
                1. String getName() 返回类的全路径
                2. String getSimpleName() 返回类名
         */
        System.out.println(clazz.getName());//com.itheima.sh.c_class_03.ClassDemo01
        System.out.println(clazz.getSimpleName());//   ClassDemo01
        //2.使用Class类中的静态方法：forName(类全名) 掌握
        Class<?> clazz2 = Class.forName("com.itheima.sh.c_class_03.ClassDemo01");
        System.out.println(clazz2.getName());//com.itheima.sh.c_class_03.ClassDemo01
        System.out.println(clazz2.getSimpleName());//   ClassDemo01

        //3.使用任意对象调用Object类中的方法：getClass() 了解
        Class clazz3 = new ClassDemo01().getClass();
        System.out.println(clazz3.getName());//com.itheima.sh.c_class_03.ClassDemo01
        System.out.println(clazz3.getSimpleName());//   ClassDemo01
    }
}
