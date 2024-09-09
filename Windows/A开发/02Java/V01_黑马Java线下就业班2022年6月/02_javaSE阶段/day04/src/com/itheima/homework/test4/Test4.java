package com.itheima.homework.test4;
/*
    请按标准格式定义一个“学生类”，它有三个属性：姓名、性别、年龄。

    要求：在测试类主方法中完成

    1. 创建学生对象打印对象时，不再是地址，而是能够将对象的属性内容打印出来。
    2. 两个学生类的对象比较时，要求姓名，性别，年龄属性值相同即认为这两个学生对象是相同的。


 */
public class Test4 {
    public static void main(String[] args) {
        Student s1 = new Student("柳岩" , "女" , 18);
        System.out.println(s1);

        Student s2 = new Student("柳岩" , "女" , 18);
        System.out.println(s1.equals(s2));
    }
}
