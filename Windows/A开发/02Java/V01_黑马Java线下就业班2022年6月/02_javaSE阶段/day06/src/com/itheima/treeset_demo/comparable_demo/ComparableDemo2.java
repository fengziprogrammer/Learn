package com.itheima.treeset_demo.comparable_demo;

import java.util.Comparator;
import java.util.TreeSet;

/*
    需求2：改写刚刚的学生案例；
    要求：按照年龄从小到大排，如果年龄一样，则按照姓名首字母排序
          如果姓名和年龄一样，才认为是同一个学生对象，不存入。
 */
public class ComparableDemo2 {
    public static void main(String[] args) {
//        TreeSet<Student> ts = new TreeSet<>( (Student o1 , Student o2)->{ return o1.getAge() - o2.getAge(); } );
        TreeSet<Student> ts = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 25);
        Student s3 = new Student("wangwu", 24);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        System.out.println(ts);
    }
}
