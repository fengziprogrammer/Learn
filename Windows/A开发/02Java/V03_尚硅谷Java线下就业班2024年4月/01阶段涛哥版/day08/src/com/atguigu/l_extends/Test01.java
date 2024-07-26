package com.atguigu.l_extends;

public class Test01 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        //manager.name = "";
        manager.setName("柳岩");
        manager.setAge(36);
        System.out.println(manager.getName()+"..."+manager.getAge());
    }
}
