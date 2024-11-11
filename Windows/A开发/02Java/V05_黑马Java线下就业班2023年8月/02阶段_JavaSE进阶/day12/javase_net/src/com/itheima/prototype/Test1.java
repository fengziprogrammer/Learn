package com.itheima.prototype;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Teacher t1 = Teacher.getInstance();
            System.out.println(t1);
        }
    }
}
