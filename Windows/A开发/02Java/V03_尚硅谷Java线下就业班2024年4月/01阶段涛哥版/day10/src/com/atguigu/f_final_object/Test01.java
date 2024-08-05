package com.atguigu.f_final_object;

public class Test01 {
    public static void main(String[] args) {
        final Person p1 = new Person("柳岩",36);
        System.out.println(p1);
        //p1 = new Person("曼曼",46);
        p1.setAge(38);
        System.out.println(p1.getName()+"..."+p1.getAge());

    }
}
