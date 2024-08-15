package com.atguigu.a_object;

public class Test02 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);

        System.out.println("====================");

        student = null;
        //运行垃圾回收器
        System.gc();
    }
}
