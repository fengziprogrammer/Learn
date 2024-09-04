package com.atguigu.collection;

import java.util.ArrayList;

public class Demo1 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        // System.out.println(arr1[5]); // ArrayIndexOutOfBoundsException

        String[] arr2 = {"aa","bb"};
        // System.out.println(arr2[0]);

        ArrayList list = new ArrayList();
        list.add(222);
        list.add(true);
        list.add("ccc");
        System.out.println(list);
        System.out.println(list.size());
        list.add(555);
        System.out.println(list);
        System.out.println(list.size());
    }
}
