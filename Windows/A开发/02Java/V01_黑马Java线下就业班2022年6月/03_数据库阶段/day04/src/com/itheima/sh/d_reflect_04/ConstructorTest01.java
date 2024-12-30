package com.itheima.sh.d_reflect_04;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ConstructorTest01 {

    @Test
    public void test01() throws Exception {
        /*
            需求：使用反射技术创建Student对象，使用对象调用Student类中的非静态方法show
         */
        //不使用反射
//        new Student("锁哥").show();
        //使用反射获取Student类构造方法并创建对象只需三步
        //1.获取Student类的Class对象
        Class<?> clazz = Class.forName("com.itheima.sh.d_reflect_04.Student");
        //2.获取指定的构造方法public Student(String name)
        /*
            Class类的方法：
                public Constructor<T> getConstructor(Class<?>... parameterTypes)
                    参数：
                        parameterTypes，表示获取的构造方法形参的Class类型
         */
        Constructor<?> c = clazz.getConstructor(String.class);

        //3.使用对象c调用Constructor类中的方法创建Student对象
        /*
             T newInstance(Object... initargs) 创建具体对象
                参数：
                    initargs：属于Object类型。表示调用构造方法时传递的实参
         */
        Student s = (Student) c.newInstance("尼古拉斯锁哥");

        //4.使用对象s调用Student类中的show方法
        s.show();
    }

    @Test
    public void test02() throws Exception {
        /*
            需求：使用反射技术获取Student类中私有的无参构造方法创建对象，使用对象调用method方法
         */
        //不使用反射
//        new Student().method();//报错，因为无参构造方法是私有的，不能再测试类中使用
        //1.获取Student类的Class对象
        Class<?> clazz = Class.forName("com.itheima.sh.d_reflect_04.Student");
        //2.获取无参的构造方法
         /*
            Class类的方法：
                public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
                    参数：
                        parameterTypes，表示获取的构造方法形参的Class类型
         */
        Constructor<?> c = clazz.getDeclaredConstructor();
        /*
            注意：如果访问的构造方法是私有的，那么就会报错：
                java.lang.IllegalAccessException:
                 Class com.itheima.sh.d_reflect_04.ConstructorTest01
                 can not access a member of class com.itheima.sh.d_reflect_04.Student with modifiers "private"
            解决：暴力反射
            就是在java中默认是具有权限检测机制，我们可以取消权限检测机制。使用
            Constructor的父类AccessibleObject中存在方法：
                 void setAccessible(boolean flag) 参数设置为true表示取消权限检测机制
         */
        c.setAccessible(true);
        //3.创建对象
        //对象c调用Constructor类中的方法创建Student对象
        /*
             T newInstance(Object... initargs) 创建具体对象
                参数：
                    initargs：属于Object类型。表示调用构造方法时传递的实参
         */
        Student s = (Student) c.newInstance();//底层调用Student类的私有的无参构造方法创建对象，需要在调用之前暴力反射


        //使用s调用method
        s.method();
    }

    /*
        注意：如果使用Class类中的public T newInstance()创建某个类对象要求：
            1.要求某个类中必须存在公共的无参构造方法
            2.从jdk9开始过时了，可以使用，不建议使用
     */
    @Test
    public void test03() throws Exception {
        /*
            需求：使用反射技术获取Student类中私有的无参构造方法创建对象，使用对象调用method方法
         */
        //1.获取Class对象
        Class<?> clazz = Class.forName("com.itheima.sh.d_reflect_04.Student");
        /*
            2.使用clazz调用Class类中的方法：
                 T newInstance() 创建此 Class 对象所表示的类的一个新实例。
         */
        Student s = (Student) clazz.newInstance();//底层调用Student类的无参构造方法，在该代码之前需要暴力反射
        //3.使用对象s调用method
        s.method();

    }

    /*
       需求：使用反射技术调用Student类的满参构造方法创建对象：
         public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }
    */
    @Test
    public void test04() throws Exception {
        /*
            需求：使用反射技术获取Student类中私有的无参构造方法创建对象，使用对象调用method方法
         */
        //1.获取Class对象
        Class<?> clazz = Class.forName("com.itheima.sh.d_reflect_04.Student");
        //2.获取构造方法
        Constructor<?> c = clazz.getConstructor(String.class, int.class);
        //3.创建对象
        Student s = (Student) c.newInstance("尼古拉斯赵四", 30);
        //4.使用对象s调用show
        s.show();

    }
}
