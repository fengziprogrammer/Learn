package com.itheima.homework;

public class Test {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();// 0x001
        clerk.setName("李晓亮");
        clerk.setWorkId("C0001");
        clerk.setDept("销售部");

        Manager manager = new Manager("张小强" , "M0001" , "销售部" , clerk);// 0x002

        clerk.setManager(manager);

        clerk.showMsg();
        manager.showMsg();
    }
}
