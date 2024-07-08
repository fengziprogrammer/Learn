package com.atguigu.f_array;

import java.util.Scanner;

public class Demo04Array {
    public static void main(String[] args) {
        String[] arr = new String[3];
        Scanner sc = new Scanner(System.in);
        //String data1 = sc.next();
        //String data2 = sc.next();
        //String data3 = sc.next();
        //
        //arr[0] = data1;
        //arr[1] = data2;
        //arr[2] = data3;

        //arr[0] = sc.next();
        //arr[1] = sc.next();
        //arr[2] = sc.next();
        /*for (int i = 0; i < 3; i++) {
            arr[i] = sc.next();
        }*/

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
    }
}
