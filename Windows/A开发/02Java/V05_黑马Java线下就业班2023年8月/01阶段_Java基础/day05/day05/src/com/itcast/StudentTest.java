package com.itcast;

/*
    学生测试类
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();
        //System.out.println(s1); //com.itcast.Student@4eec7777
        //System.out.println(s1.getName()); //null
        //System.out.println(s1.getAge()); //0

        //给对象赋值
        s1.setName("吴彦祖");
        s1.setAge(18);
        System.out.println(s1.getName()); //吴彦祖
        System.out.println(s1.getAge()); //18

        //调用对象的方法
        s1.study();
        s1.eat();
    }
}
