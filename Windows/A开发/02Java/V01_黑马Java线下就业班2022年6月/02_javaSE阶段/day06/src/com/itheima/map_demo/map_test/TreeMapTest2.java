package com.itheima.map_demo.map_test;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
    需求 : 创建一个TreeMap集合，键是学生对象(Student)，值是籍贯(String)。
    学生 : 属性姓名和年龄, 要求按照年龄进行升序排序并遍历
 */
public class TreeMapTest2 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 根据年龄降序
                int result = o2.getAge() - o1.getAge();
                // 年龄相等 , 根据名字降序
                return result == 0 ? o2.getName().compareTo(o1.getName()) : result;
            }
        });

        Student s1 = new Student("迪丽热巴", 18);
        Student s2 = new Student("古力娜扎", 20);
        Student s3 = new Student("马尔扎哈", 10);
        Student s4 = new Student("迪丽热巴", 18);

        // 把学生对象作为键存储到集合中
        tm.put(s1, "新疆");
        tm.put(s2, "新疆");
        tm.put(s3, "虚空");
        tm.put(s4, "新疆");

        Set<Map.Entry<Student, String>> set = tm.entrySet();
        for (Map.Entry<Student, String> entry : set) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);
        }
    }
}
