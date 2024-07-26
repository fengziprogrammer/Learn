package com.atguigu.d_extends;

public class Test01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "涛哥";
        teacher.age = 18;
        System.out.println(teacher.name+"..."+teacher.age);
        teacher.work();

        System.out.println("===============");
        Manager manager = new Manager();
        manager.name = "曼曼";
        manager.age = 13;
        System.out.println(manager.name+"..."+manager.age);
        manager.work();
    }
}
