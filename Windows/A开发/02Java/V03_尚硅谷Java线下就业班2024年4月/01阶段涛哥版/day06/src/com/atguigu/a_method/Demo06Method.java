package com.atguigu.a_method;

public class Demo06Method {
    public static void main(String[] args) {
        int[] arr = returnData();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] returnData(){
        int a = 10;
        int b = 5;

        int sum = a+b;
        int sub = a-b;

        int[] arr = {sum,sub};

        return arr;
    }
}
