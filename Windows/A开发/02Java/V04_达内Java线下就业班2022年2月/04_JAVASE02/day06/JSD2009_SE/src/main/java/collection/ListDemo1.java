package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List接口
 * List继承自Collection，是集合中非常常用的一个子类型。特点是:可以放重复元素
 * 并且有序，其提供了一套通过下标操作元素的方法。
 *
 * 常见实现类:
 * java.util.ArrayList:内部使用数组实现，查询性能更好。
 * java.util.LinkedList:内部使用链表实现，增删元素性能更好，首尾增删元素
 * 性能最佳。
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list);

        /*
            E get(int index)
            获取指定下标所对应的元素
         */
        String str = list.get(2);
        System.out.println(str);

        for(int i=0;i<list.size();i++){
            str = list.get(i);
            System.out.println(str);
        }


        /*
            E set(int index,E e)
            将给定元素设置到指定位置，返回值为该位置原有元素
         */
        //[one,two,3,four,five]
        String old = list.set(2,"3");
        System.out.println(list);
        System.out.println("old:"+old);

        //利用get,set反正集合的翻转操作
        for(int i=0;i<list.size()/2;i++){
            String s = list.get(i);//获取正数位置上的元素
            s = list.set(list.size()-1-i,s);//将正数位置上的元素放到倒数位置
            list.set(i,s);
        }
        System.out.println(list);
    }

}







