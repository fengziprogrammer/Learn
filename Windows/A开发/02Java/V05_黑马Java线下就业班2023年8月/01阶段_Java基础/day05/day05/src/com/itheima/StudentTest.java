package com.itheima;

/*
    学生测试类
        数据类型 对象名 = new 数据类型();
            类名就是对象的数据类型!
        面向对象是基于面向过程
            面向过程就是一步一步的完成功能
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建学生对象1
        Student s1 = new Student();
        System.out.println(s1); //地址
        System.out.println(s1.getName() + "," + s1.getAge()); //null,0
        //赋值
        s1.setName("吕布");
        s1.setAge(28);
        //打印属性
        System.out.println(s1.getName() + "," + s1.getAge()); //吕布,28
        //测试方法
        s1.study();
        s1.eat();
        //创建学生对象2
        Student s2 = new Student();
        s2.setName("貂蝉");
        s2.setAge(16);
        //打印属性
        System.out.println(s2.getName() + "," + s2.getAge());
        //测试方法
        s2.study();
        s2.eat();
    }
}
