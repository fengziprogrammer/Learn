package com.atguigu.b_classloader;

import sun.net.spi.nameservice.dns.DNSNameService;

public class Demo01ClassLoader {
    public static void main(String[] args) {
        app();
        //ext();
        //boot();
    }

    /**
     * 负责加载核心类
     * BootStrapClassLoader:C语言编写,我们是获取不到的
     */
    private static void boot() {
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
    }

    /**
     * 负责加载扩展类
     */
    private static void ext() {
        ClassLoader classLoader = DNSNameService.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
    }

    /**
     * 负责加载自定义类
     */
    private static void app() {
        ClassLoader classLoader = Demo01ClassLoader.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);

        ClassLoader parent = classLoader.getParent();
        System.out.println("parent = " + parent);

        ClassLoader parent1 = parent.getParent();
        System.out.println("parent1 = " + parent1);//null
    }
}
