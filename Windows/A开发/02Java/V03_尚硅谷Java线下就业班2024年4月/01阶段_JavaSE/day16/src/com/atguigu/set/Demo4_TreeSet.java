package com.atguigu.set;

import com.atguigu.bean.Student;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo4_TreeSet {

    /*
    TreeSet 如何保证元素的唯一性
        原理
            依据排序去重
            自然排序:
                1> 自定义类 implements Comparable
                2> 重写 compareTo()
                    该方法的返回值 代表两个对象(对象为this与参数o)的差值  决定了如何排序
                    0 两个对象一致  去重  -> 只保留第一个元素
                    正数  后- 前 差值为正  后 > 前  --> 正序输出
                    负数  后 < 前  --> 逆序输出

     */
    public static void main(String[] args) {

        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(44);
        set.add(11);
        set.add(11);
        set.add(22);
        set.add(22);
        set.add(33);
        System.out.println(set);*/

        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student("张三",23));// ClassCastException
        set.add(new Student("张三",23));
        set.add(new Student("张三",24));
        set.add(new Student("李四",24));
        set.add(new Student("李四",24));
        set.add(new Student("李四",23));
        set.add(new Student("王五",25));
        System.out.println(set);
        System.out.println(set.size());//
    }
}
