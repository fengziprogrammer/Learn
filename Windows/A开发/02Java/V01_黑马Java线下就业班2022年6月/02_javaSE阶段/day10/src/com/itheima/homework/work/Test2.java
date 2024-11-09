package com.itheima.homework.work;

import java.util.ArrayList;
import java.util.Collections;

/*
     请使用Lambda表达式调用Collections的sort()方法，可以实现对一个List<String>集合进行：降序排序。

    编写main()方法，在main()中按以下步骤编写代码：

    1. 定义一个List<String>集合，并存储以下数据：

            ```
            "cab","bac","acb","cba",“bca”,"abc"
            ```

        2. 使用Lambda表达式调用Collections的sort()方法对集合进行降序排序。

    2. 排序后向控制台打印集合的所有元素。


 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "cab", "bac", "acb", "cba", "bca", "abc");

        //   public static <T> void sort(List<T> list , Comparator<? super T> c) {
        Collections.sort(list, (String o1, String o2) -> {
            return -o1.compareTo(o2);
        });

        System.out.println(list);
    }
}
