package com.itheima.homework.test2;
// ctrl + alt + shift  + u
public class UITeacher extends Employee implements Paint {
    public UITeacher() {
    }

    public UITeacher(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void work() {
        System.out.println("讲解UI课程");
    }

    @Override
    public void paint() {
        System.out.println("具备画图技术");
    }
}
