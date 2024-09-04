package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo6 {

    /*
       需求
            定义一个集合,删除集合中"aa"元素

            需求变更
                发现存在aa元素,就在后面添加一个www元素

       快速失败（fail-fast）机制

            迭代器 监测,如果 除了迭代器同时还有其他对象对元素进行操作,
            迭代器立马抛出一个ConcurrentModificationException异常,导致程序完全失败

            当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常
            ConcurrentModificationException  并发修改异常
            并发
            "同时"
            元素 被"同时"操作 --> 并发修改
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("aa");
        list.add("bbb");
        list.add("cc");
        System.out.println(list);

       // 使用迭代器 遍历每一个元素  将"aa" 删除
       /* Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if(s.equals("aa")){
                // list.remove(s);
                //it.remove();
                list.add("www");
            }
        }*/

        // 底层依赖的是迭代器 ,迭代器需要注意的事项,同样通用 也会引发并发修改异常
        /*for (String s:list){
            if(s.equals("aa")){
                // list.remove(s);
                it.remove();
                // list.add("www");
            }
        }*/



        System.out.println(list);

    }
}
