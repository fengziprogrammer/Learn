package com.itheima.set_demo;
/*
    哈希值：是JDK根据对象的地址或者对象的属性算出来的int类型的数值

    Object类中有一个方法可以获取对象的哈希值
        1 public int hashCode()：返回对象的哈希码值

    对象的哈希值特点
        1 同一个对象多次调用hashCode()方法返回的哈希值是相同的
        2 默认情况下，不同对象的哈希值是不同的。而重写hashCode()方法，不同对象的哈希值有可能相同
 */
public class HashCodeDemo {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.hashCode()); // 根据地址进行计算的哈希值 23934342
        System.out.println(p.hashCode()); // 根据地址进行计算的哈希值 23934342


        Student s = new Student();
        System.out.println(s.hashCode()); // 根据对象的属性值计算的哈希值

        // 而重写hashCode()方法，不同对象的哈希值有可能相同(巧合)
        System.out.println("重地".hashCode()); // 1179395
        System.out.println("通话".hashCode()); // 1179395
    }
}
