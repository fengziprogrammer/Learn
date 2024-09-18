package com.itheima.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/*
    请定义一个Collection类型的集合，存储以下字符串：


      "JavaEE企业级开发指南"
      "Oracle高级编程"
      "MySQL从入门到精通"
      "Java架构师之路"


    请编程实现以下功能：

    - 使用迭代器遍历所有元素，并打印
    - 使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
    - 使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
    - 如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
 */
public class Test5 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection<String> c = new ArrayList<>();

        // 添加元素
        c.add("JavaEE企业级开发指南");
        c.add("Oracle高级编程");
        c.add("MySQL从入门到精通");
        c.add("Java架构师之路");

        // 完成需要
        // 使用迭代器遍历所有元素，并打印
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("===================");

        // 使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
        for (String s : c) {
            if (s.length() < 10) {
                System.out.println(s);
            }
        }

        System.out.println("===================");

        // 使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
        for (String s : c) {
            if (s.contains("Java")) {
                System.out.println(s);
            }
        }

        System.out.println("===================");

        // 如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
        Iterator<String> it2 = c.iterator();
        while (it2.hasNext()) {
            String s = it2.next();
            if (s.contains("Oracle")) {
                it2.remove();
            }
        }

        System.out.println(c);// 打印集合对象 , 查看内容

    }
}
