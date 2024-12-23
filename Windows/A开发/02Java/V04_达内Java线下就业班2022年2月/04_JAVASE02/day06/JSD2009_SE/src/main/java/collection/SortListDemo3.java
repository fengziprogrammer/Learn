package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 有时候集合元素已经实现了Comparable接口可以比较大小，但是其比较规则不满足
 * 我们的排序需求时，我们仍然可以使用重载的sort方法临时传入一个比较规则来进行
 * 排序。
 *
 * 排序字符串
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("ada");
//        list.add("siri");
//        list.add("jack");
//        list.add("Lisa");
//        list.add("Tom");
//        list.add("Jerry");
//        list.add("Jill");
//        list.add("rose");
//        list.add("james");
//        list.add("lilei");
//        list.add("hanmeimei");

        list.add("苍老师");
        list.add("传奇");
        list.add("小泽老师");

        System.out.println(list);
//        Collections.sort(list);
        Collections.sort(list,(o1,o2)->o2.length()-o1.length());


        System.out.println(list);
    }
}






