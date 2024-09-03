package com.itheima.api_demo.object_demo;

/*
    Object类 :
        public boolean equals(Object obj)

    == : 关系运算符
        比较基本数据类型 : 比较的是数据值
        比较引用数据类型 : 比较的是地址值

    Object类
    public boolean equals(Object obj) {
        // this : 调用此方法的对象
        return (this == obj);
    }

    结论 :
        如果一个类没有重写equals方法 , 那么比较此类的对象比较的是地址值
        如果一个类重写了equals方法, 那么比较这个类的对象比较的内容是否相等!!!
 */
public class EqualsDemo {
    public static void main(String[] args) {
        Student s1 = new Student("李沁", 18);
        Student s2 = new Student("李沁", 19);

        // 需求 : 比较两个对象的内容
        // System.out.println(s1 == s2);// false

        // public boolean equals(Object obj)
        if(s1 != null) {
            System.out.println(s1.equals(s2)); // true
        }
    }
}
