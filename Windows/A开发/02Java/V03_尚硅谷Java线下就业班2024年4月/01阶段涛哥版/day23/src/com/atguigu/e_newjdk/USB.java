package com.atguigu.e_newjdk;

public interface USB {
    public abstract void open();

    public default void methodDef(){

        methodPri();

        System.out.println("默认方法");
    }

    public static void methodSta(){
        methodPriSta();
        System.out.println("静态方法");
    }

    /**
       jdk9出现了私有方法,只供内部使用
     */
    private void methodPri(){
        System.out.println("私有方法");
    }

    private static void methodPriSta(){
        System.out.println("静态的私有方法");
    }

}
