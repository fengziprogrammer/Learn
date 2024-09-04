package com.atguigu.genericity;

import com.atguigu.bean.BeanStudent;
import com.atguigu.bean.Student;

import java.util.ArrayList;
import java.util.Collection;

public class Demo13 {
    public static void main(String[] args) {
        Collection con1 = new ArrayList<>();
        con1.add(new Student("常同学",3));
        con1.add(new Student("王同学",4));
        con1.add(new Student("刘",5));

        System.out.println(con1);
        System.out.println(con1.size());

        Collection con2 = new ArrayList<>();
        con2.add(new BeanStudent("王凯",18));
        con2.add(new BeanStudent("丁真",16));
        con2.add(new BeanStudent("蔡徐坤",15));
        con2.add(new BeanStudent("马保国", 66));

        System.out.println(con2);
        System.out.println(con2.size());

        // con1.addAll(con2);// 类似于将容器中的元素 单个取出来 进行add
        con1.add(con2);//  类似于将容器当成整体进行添加
        System.out.println(con1);
        System.out.println(con1.size());// 7
    }
}
