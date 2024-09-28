package com.itheima.homework.test7;

import java.util.LinkedHashSet;

/*
    请按以下要求顺序编码：

    1. 定义一个可以存储“整数”的LinkedHashSet对象
    2. 存储以下整数: 20,30,50,10,30,20
    3. 打印集合大小。为什么跟存入的数量不一致？
    4. 使用增强for遍历集合，打印大于25的元素
 */
public class Test7 {
    public static void main(String[] args) {
//        1. 定义一个可以存储“整数”的LinkedHashSet对象
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

//        2. 存储以下整数: 20,30,50,10,30,20
        lhs.add(20);
        lhs.add(30);
        lhs.add(50);
        lhs.add(10);
        lhs.add(30);
        lhs.add(20);

//        3. 打印集合大小。为什么跟存入的数量不一致？
        // 因为底层是哈希表结构+链表结构 , 哈希表保证元素唯一 , 链表保证元素顺序
        System.out.println(lhs.size());

        System.out.println("=============");

//        4. 使用增强for遍历集合，打印大于25的元素
        for (Integer lh : lhs) {
            if(lh> 25){
                System.out.println(lh);
            }
        }
    }
}
