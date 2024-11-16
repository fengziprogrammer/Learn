package com.atguigu.e_classloader;

public class Demo01ClassLoader {
    public static void main(String[] args) {
        app();
        //boot();
    }

    private static void boot() {
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);//null BootStrapClassLoader是C语言写的,我们获取不到
    }

    private static void app() {
        ClassLoader classLoader = Demo01ClassLoader.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
        ClassLoader parent = classLoader.getParent();
        System.out.println("parent = " + parent);
        ClassLoader parent1 = parent.getParent();
        System.out.println("parent1 = " + parent1);
    }
}
