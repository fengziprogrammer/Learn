package com.itheima.treeset_demo.comparable_demo;

import java.util.TreeSet;

/*
    排序方式1 :  自然排序 :
        1 使用空参构造创建TreeSet集合
        2 自定义的Student类实现Comparable接口
        3 重写里面的compareTo方法
    排序规则 :
        1 根据compareTo方法的返回值进行指定元素位置
        2 如果返回值为负数，表示当前存入的元素是较小值，存左边
        3 如果返回值为0，表示当前存入的元素跟集合中元素重复了，不存
        4 如果返回值为正数，表示当前存入的元素是较大值，存右边

    需求1 : 改写存储学生对象的案例，并按照年龄从小到大排列
 */
public class ComparableDemo1 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();// {s1 , s3 , s2 , s4}

        Student s1 = new Student("zhangsan" , 23);
        Student s2 = new Student("lisi" , 25);
        Student s3 = new Student("wangwu" , 24);
        Student s4 = new Student("zhaoliu" , 25);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);
    }
}
