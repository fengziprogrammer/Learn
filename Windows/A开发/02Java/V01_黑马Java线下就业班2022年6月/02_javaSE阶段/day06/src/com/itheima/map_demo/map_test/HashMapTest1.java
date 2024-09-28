package com.itheima.map_demo.map_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求 :
        存储数据，每位学生（姓名，年龄）都有自己的家庭住址。
        学生和地址有对应关系，将学生对象和家庭住址存储到map集合中。学生作为键, 家庭住址作为值。
        要求：学生姓名相同并且年龄相同视为同一名学生，不能重复存储

         集合中存储的元素 :
        ("迪丽热巴", 18), "新疆"
        ("古力娜扎", 20), "新疆"
        ("马尔扎哈", 10), "虚空"
        ("马尔扎哈", 10), "峡谷"

    注意 : HashMap集合 , 要想保证键唯一 , 那么键所在的类必须重写hashCode和equals方法!!!

    分析 :
        1 创建学生类 : 名字 , 年龄
        2 创建HashMap集合 , HashMap< Student , String >
        3 添加元素
        4 遍历
 */
public class HashMapTest1 {
    public static void main(String[] args) {
        // 创建Map集合对象
        HashMap<Student, String> hm = new HashMap<>();

        // 创建元素对象
        Student s1 = new Student("迪丽热巴", 18);
        Student s2 = new Student("古力娜扎", 20);
        Student s3 = new Student("马尔扎哈", 10);
        Student s4 = new Student("迪丽热巴", 18);

        // 添加元素
        hm.put(s1, "新疆");
        hm.put(s2, "新疆");
        hm.put(s3, "虚空");
        hm.put(s4, "中国新疆");

        // 遍历集合
        // 键找值
        Set<Student> set = hm.keySet();// {s1 , s2 , s3 , s4}
        for (Student key : set) {
            String value = hm.get(key);
            System.out.println(key + "----" + value);
        }

        System.out.println("==============");

        // 获取键值对对象的方式
        Set<Map.Entry<Student, String>> set2 = hm.entrySet();
        for (Map.Entry<Student, String> entry : set2) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);
        }
    }
}
