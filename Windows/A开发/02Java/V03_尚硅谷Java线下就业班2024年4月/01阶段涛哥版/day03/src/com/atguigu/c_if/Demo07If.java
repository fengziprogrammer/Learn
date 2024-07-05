package com.atguigu.c_if;

public class Demo07If {
    public static void main(String[] args) {
        boolean num1 = false;
        boolean num2 = true;

        int i = 1;

        /*
          num2为true
          将num2的值赋值给了num1,num1由false变成true
         */
        if (num1=num2){
            i++;
            System.out.println(i);//2
        }

        if (false){
            --i;
            System.out.println(i);
        }
    }
}
