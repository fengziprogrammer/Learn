package com.itheima.static_app.memory;

public class StudentTest {
    public static void main(String[] args) {
        //访问静态成员变量
        Student.school = "传智专修学院";

        Student s = new Student();
        s.name = "张三";
        s.age = 23;
        s.show();

        Student s2 = new Student();
        s2.show();

    }
}
