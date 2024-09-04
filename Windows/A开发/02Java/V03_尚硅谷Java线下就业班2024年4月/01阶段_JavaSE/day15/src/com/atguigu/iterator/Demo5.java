package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo5 {


    /*
        增强for循环
            底层依赖 迭代器
            作用
                遍历集合/数组里面的元素
             格式
                for(容器的元素类型 元素名:容器){
                }
          注意事项
             增强for循环 只做遍历时使用
     */
    public static void main(String[] args) {

        ArrayList<String> list2 = new ArrayList();
        list2.add("aa");
        list2.add("bbb");
        list2.add("cc");
        System.out.println(list2);

        // 获取一个迭代器
        Iterator<String> it = list2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 增强for循环
        for(String s:list2){// s 每一个元素
            System.out.println(s);
        }


    }
}
