package com.itheima.object_demo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    Object类 :
        类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。所有对象（包括数组）都实现这个类的方法

        public String toString() :
        结论 :
            1 如果一个类没有重写toString方法 , 那么打印此类的对象打印的是地址值
            2 如果一个类重写了toString方法 , 那么打印此类对象打印的是对象的属性值



        当我们打印学生对象 , 会把学生对象传入给底层代码中的obj接收
        我们在此方法中会对对象是否为空做判断 , 如果对象不为null , 会采用此对象调用toString()
        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }

        因为我们Student类中没有toString方法 , 所以说调用的是Object类中的toString()
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        getClass() : 获取的是一个类的字节码对象
        getClass().getName() : 获取的是一个类的全类名(包名 + 类名)
        hashCode() : 获取的是一个对象的十进制地址值
        Integer.toHexString(十进制数据) : 把十进制数据转换成十六进制数据
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("李沁" , 18);
        // com.itheima.object_demo.Student@3feba861
        System.out.println(s1);
        System.out.println(s1.toString());

//        StringBuilder sb = new StringBuilder("abc");
//        System.out.println(sb);
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc);
//        Random r = new Random();
//        System.out.println(r);

        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("asd");
        System.out.println(list);
    }
}
