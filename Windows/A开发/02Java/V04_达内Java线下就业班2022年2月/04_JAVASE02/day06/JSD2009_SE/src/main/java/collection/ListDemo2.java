package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了一对重载的add,remove方法
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        /*
            void add(int index,E e)
            将给定元素添加到指定位置，原位置及后续元素顺序向后移动
            插入操作
         */
        list.add(2,"3");
        System.out.println(list);

        //[one,two,3,four,five]
        /*
            E remove(int index)
            删除并返回指定位置的元素
         */
        String old = list.remove(3);
        System.out.println(list);
        System.out.println("被删除的元素是:"+old);


    }
}








