package com.atguigu.generic;

import org.junit.Test;

/*
3、自定义泛型类
当我们在类或接口中定义某个成员时，该成员的相关类型是不确定的，而这个类型需要在使用这个类或接口时才可以确定，那么我们可以使用泛型。
【修饰符】 class 类名<类型变量列表> 【extends 父类】 【implements 父接口们】{

}
【修饰符】 interface 接口名<类型变量列表> 【extends 父接口们】{

}

注意：
（1）自己声明类型变量时，请用单个大写字母表示未知的泛型类型。
通常：<T>，<E>，<R>，<U>等
（2）如果有多个未知的类型需要传递，那么类型变量可以同时声明多个，每一个使用逗号分隔
例如：<K,V>

这里为什么不使用单词，而使用单个的大写字母呢？
因为如果写单词，会和已知的类型混淆，重名，无法区别。

例如：我们要声明一个学生类，该学生包含姓名、成绩，而此时学生的成绩类型不确定，为什么呢，
因为，语文老师希望成绩是“优秀”、“良好”、“及格”、“不及格”，
数学老师希望成绩是89.5, 65.0，
英语老师希望成绩是'A','B','C','D','E'。
那么我们在设计这个学生类时，就可以使用泛型。

（3）泛型类或泛型接口中，就可以使用类或接口上面声明的泛型，用它声明变量，参数，返回值类型等。
（4）但是类或接口上面声明的泛型不允许用在静态成员上。
   为什么？
   因为类或接口上面声明的泛型是未知的类型，需要再new对象时确定，而静态是早于对象创建的使用，或者说不依赖与对象的。
 */
public class TestDefineGenericClass {
    @Test
    public void test01(){
        //语文老师
        //语文老师希望成绩是“优秀”、“良好”、“及格”、“不及格”，
        Student<String> s1 = new Student<String>("张三","优秀");
        System.out.println(s1);
    }

    @Test
    public void test02(){
        //数学老师希望成绩是89.5, 65.0，
//        Student<double> s1 = new Student<double>("张三",85.0);//错误，因为泛型必须是引用数据类型
//        Student<Double> s1 = new Student<Double>("张三",85);//错误，85是int，不能自动装箱为Double
//        Student<Double> s1 = new Student<Double>("张三",85d);//可以，因为数字后加d或F表示double或float
        Student<Double> s1 = new Student<Double>("张三",85.0);//可以，因为数字后加d或F表示double或float
        System.out.println(s1);
    }

    @Test
    public void test03() {
        //英语老师希望成绩是'A','B','C','D','E'。
        //JDK1.7之后，左边如果指定了泛型，右边new对象时，<>中可以省略，因为它可以自动类型推断
        Student<Character> s = new Student<>("张三",'A');
        System.out.println(s);
    }

    @Test
    public void test04(){
        //语文老师
        //语文老师希望成绩是“优秀”、“良好”、“及格”、“不及格”，
        Student<String> s1 = new Student<String>("张三","优秀");
        System.out.println(s1);

        ChineseStudent s2 = new ChineseStudent("张三","优秀");
        System.out.println(s2);
    }
}
