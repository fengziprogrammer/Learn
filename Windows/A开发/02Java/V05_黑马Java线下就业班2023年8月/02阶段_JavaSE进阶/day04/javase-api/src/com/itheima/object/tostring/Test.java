package com.itheima.object.tostring;

public class Test {
    //演示：toString方法
    public static void main(String[] args) {
        //创建学生对象
        Student stu = new Student("熊大", 23);

        //把对象转换为字符串（希望把对象中存储的内容，转换为一个字符串）
        //String str = stu.toString();

        System.out.println(stu);//println方法中自动调用：对象.toString()
    }
}
