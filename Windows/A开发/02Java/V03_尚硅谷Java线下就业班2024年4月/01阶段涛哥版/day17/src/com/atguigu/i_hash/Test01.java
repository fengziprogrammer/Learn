package com.atguigu.i_hash;

public class Test01 {
    public static void main(String[] args) {
        Person p1 = new Person("柳岩", 36);
        Person p2 = new Person("曼曼", 26);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.hashCode());//325040804
        System.out.println(p2.hashCode());//1173230247
        System.out.println(Integer.toHexString(325040804));
        System.out.println(Integer.toHexString(1173230247));

        System.out.println("================================");

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println("================================");

        String s3 = "通话";
        String s4 = "重地";
        System.out.println(s3.hashCode());//1179395
        System.out.println(s4.hashCode());//1179395

        System.out.println("================================");

        Student student1 = new Student("柳岩", 36);
        Student student2 = new Student("柳岩", 36);
        System.out.println(student1.hashCode());//26309519
        System.out.println(student2.hashCode());//26309519
    }
}
