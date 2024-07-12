package com.itheima;

/*
    测试类
 */
public class TeacherTest {
    public static void main(String[] args) {
        //创建老师对象(空参)
        //数据类型 对象名 = new 数据类型();
        Teacher t = new Teacher();
        t.setName("吴彦祖");
        t.setAge(18);
        System.out.println(t.getName() + "," + t.getAge());
        //测试方法
        t.teach();

        //创建老师对象(带参)
        Teacher teacher = new Teacher("苍老师",18);
        System.out.println(teacher.getName() + "," + teacher.getAge());
        //测试方法
        teacher.teach();

    }
}
