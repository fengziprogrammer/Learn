package com.atguigu.j_innerclass;

public class Student {
    String name = "张三";
    class Heart{
        String name = "心脏";
        public void display(String name){
            System.out.println(name);
            System.out.println(this.name);
            //可以简单理解为Student的成员变量(this.name)
            System.out.println(Student.this.name);
        }
    }
}
