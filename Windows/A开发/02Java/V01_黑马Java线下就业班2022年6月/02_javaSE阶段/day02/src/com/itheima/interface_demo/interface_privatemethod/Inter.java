package com.itheima.interface_demo.interface_privatemethod;

public interface Inter {

    public static void start() {
        System.out.println("start开始方法执行");
        // System.out.println("日志记录");
        log();
    }

    public static void end() {
        System.out.println("end开始方法执行");
        // System.out.println("日志记录");
        log();
    }

    // 接口私有的静态方法 : 抽取接口中静态方法的共性内容 , 防止外界访问
    private static void log() {
        System.out.println("日志记录");
    }

//    public default void start() {
//        System.out.println("start开始方法执行");
//        // System.out.println("日志记录");
//        log();
//    }
//
//    public default void end() {
//        System.out.println("end开始方法执行");
//        // System.out.println("日志记录");
//        log();
//    }
//
//    // 接口私有的方法 : 抽取接口中默认方法的共性内容 , 防止外界访问
//    private void log() {
//        System.out.println("日志记录");
//    }
}

