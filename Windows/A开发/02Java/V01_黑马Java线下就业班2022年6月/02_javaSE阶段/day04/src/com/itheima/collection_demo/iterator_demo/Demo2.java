package com.itheima.collection_demo.iterator_demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    ConcurrentModificationException : 并发修改异常
    产生的原因 : 迭代器遍历集合, 采用集合对象修改了集合的长度(添加 , 删除) , 就会发生并发修改异常

    解决方案 ;
        1 迭代器遍历集合 , 迭代器修改集合的长度 , 建议使用!
        2 不用迭代器遍历 , 可以采用普通for循环

    扩展 :
        public interface ListIterator<E>  extends  Iterator<E>
        ListIterator : 列表迭代器
        注意事项 : 只能用在List的体系

 */
public class Demo2 {
    public static void main(String[] args) {
        // 集合对象
        Collection<String> c = new ArrayList<>();

        // 添加元素
        c.add("貂蝉");
        c.add("小乔");
        c.add("大乔");
        c.add("尚香");
        c.add("甄宓");

        // 判断是否存在小乔 , 如果存在小乔把小乔干掉
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("小乔")) {
                it.remove();
            }
        }

        System.out.println(c);
    }
}