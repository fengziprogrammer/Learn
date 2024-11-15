package com.itheima.homework;

import java.util.ResourceBundle;

public class Test3 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("iphone");
        String value = bundle.getString("price");
        System.out.println(value);

    }
}
