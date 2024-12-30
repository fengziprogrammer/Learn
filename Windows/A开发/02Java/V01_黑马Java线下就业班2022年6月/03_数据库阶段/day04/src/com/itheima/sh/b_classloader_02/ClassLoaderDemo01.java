package com.itheima.sh.b_classloader_02;
/*
    jdk8前的三种类加载器:
        1.启动类加载器：负责加载api定义好的类，BootStrap ClassLoader(爷爷)
        2.扩展类加载器：负责加载扩展类，ExtClassLoader(爸爸)
        3.应用类加载器：负责自定义类，AppClassLoader(孙子)

        双亲委派机制：思想每次由当前类的类加载器加载字节码文件对象到内存中都要询问父类加载器是否可以加载，父类加载器可以加载则加载
        如果不能加载，则继续询问上一层父类加载器加载，如果都不能加载则自己加载
        注意：jdk9引入模块化思想取消了双亲委派机制。提高加载效率
 */
public class ClassLoaderDemo01 {
    public static void main(String[] args) {
        //1.获取自定义类ClassLoaderDemo01的类加载器，需要使用Class类中的方法
        // ClassLoader getClassLoader()返回该类的类加载器。
        //1.1获取当前自定义类ClassLoaderDemo01的Class对象
        //clazz 对象名
        //Class 对象类型
        Class clazz = ClassLoaderDemo01.class;
        //1.2获取类加载器
        ClassLoader classLoader = clazz.getClassLoader();
        //classLoader = sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println("classLoader = " + classLoader);

        /*
            AppClassLoader属于一个类，既然是一个类，应该也会由类加载器加载，那么他被谁加载了？
                被他父类ExtClassLoader加载的，获取当前类加载器的父类加载器使用ClassLoader类中的方法：
                     ClassLoader getParent() 返回委托的父类加载器。
         */
        //获取classLoader即AppClassLoader的父类加载器
        ClassLoader parent = classLoader.getParent();
        //sun.misc.Launcher$ExtClassLoader@6d6f6e28
        System.out.println(parent);

        //获取parent即ExtClassLoader的父类加载器
        ClassLoader grandPa = parent.getParent();
        /*
            grandPa = null,由于ExtClassLoader的父类加载器是BootStrap ClassLoader，属于顶层
            类加载器，他底层是一段c++代码编写，所以当获取BootStrap ClassLoader的时候会返回null
         */
        System.out.println("grandPa = " + grandPa);


    }
}
