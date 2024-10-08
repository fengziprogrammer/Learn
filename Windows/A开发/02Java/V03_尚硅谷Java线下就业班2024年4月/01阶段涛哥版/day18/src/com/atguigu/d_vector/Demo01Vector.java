package com.atguigu.d_vector;

import java.util.Vector;

public class Demo01Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(10,5);
        vector.add("a");
        vector.add("b");
        System.out.println(vector);
    }
}
