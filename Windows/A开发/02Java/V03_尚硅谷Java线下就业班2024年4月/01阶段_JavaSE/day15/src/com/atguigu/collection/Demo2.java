package com.atguigu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class Demo2 {

    /*
    - 添加元素
        add(E obj)：添加元素对象到当前集合中

        - 删除元素
        boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
        boolean removeIf(Predicate<? super E> filter)：根据条件进行移除
        void   clear()：清空集合中的元素

        - 查询与获取元素
        boolean isEmpty()：判断当前集合是否为空集合。
        boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素。
        int size()：获取当前集合中实际存储的元素个数
        Object[] toArray()：返回包含当前集合中所有元素的数组
     */
    public static void main(String[] args) {

        // Collection con = new Collection();
        Collection con = new ArrayList();//con 只能调用父类功能
        con.add("aaa");
        con.add("bbb");
        con.add("ccc");
        con.add("dd");
        System.out.println(con);
        System.out.println(con.size());

        con.remove(true);
        System.out.println(con);

        con.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {//如果此方法的返回值为true  o 当前集合的每一个元素
               String s = (String)o;
                return s.length() == 3;
            }
        });

        System.out.println(con);

        //con.clear();
        System.out.println(con.isEmpty());//

        System.out.println("--------------------------");
        System.out.println(con.contains("dd"));
        System.out.println(con.contains("aaa"));
        System.out.println(con.size());

        Object[] arr = con.toArray();
        System.out.println(Arrays.toString(arr));


    }
}
